package com.rj.gd.streams.uc2;

import com.rj.gd.streams.uc2.types.gen.Address;
import com.rj.gd.streams.uc2.types.gen.Item;
import com.rj.gd.streams.uc2.types.gen.PosInvoice;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.KStream;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://github.com/timtebeek/topology-test-driver-avro/tree/master/src/main/java/com/github/timtebeek
// https://blog.jdriven.com/2019/12/kafka-streams-topologytestdriver-with-avro/
// https://github.com/spring-projects/spring-kafka/blob/main/spring-kafka/src/test/java/org/springframework/kafka/streams/messaging/MessagingTransformerTests.java#L68
// https://github.com/spring-cloud/spring-cloud-stream-samples/blob/main/kafka-streams-samples/kafka-streams-inventory-count/src/test/java/kafka/streams/inventory/count/TopolologyTestDriverKafkaStreamsInventoryCountTests.java

@Log4j2
public class RjUseCaseTwoApplicationTest {

    static final String SCHEMA_REGISTRY_SCOPE = RjUseCaseTwoApplicationTest.class.getName();
    static final String MOCK_SCHEMA_REGISTRY_URL = "mock://" + SCHEMA_REGISTRY_SCOPE;

    RjUseCaseTwoApplication app = new RjUseCaseTwoApplication();

    static Properties conf;
    static TopologyTestDriver testDriver;

    @BeforeAll
    public static void onBeforeAll() {
        conf = new Properties();
        conf.put(StreamsConfig.APPLICATION_ID_CONFIG, "RJUseCaseTwoTest");
        conf.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "ignored");
        conf.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.StringSerde.class);
        conf.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        conf.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, MOCK_SCHEMA_REGISTRY_URL);
    }

    @BeforeEach
    public void onBefore() {
        StreamsBuilder sb = new StreamsBuilder();
        KStream<String, PosInvoice> input = sb.stream("posinvoice");

        Function<KStream<String, PosInvoice>, KStream<String, PosInvoice>> f = app.process();

        KStream<String, PosInvoice> output = f.apply(input);
        output.to("shipment");

        Topology t = sb.build();
        testDriver = new TopologyTestDriver(t, conf);
        log.info(t.describe().toString());
    }

    @Test
    @DisplayName("posInvoice with DeliveryHomeType only to shipment topic")
    public void shouldPropagatePosInvoiceWithDeliveryHomeTypeToShipment() {

        Map<String, String> serdeConfig = Map.of(
                AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, MOCK_SCHEMA_REGISTRY_URL);

        Serde<PosInvoice> posInvoiceSerde = app.avroInSerdePosInvoice();
        posInvoiceSerde.configure(serdeConfig, false);
                
        TestInputTopic<String, PosInvoice> posInvoiceTopic = testDriver.createInputTopic("posinvoice",
                Serdes.String().serializer(),
                posInvoiceSerde.serializer());

        TestOutputTopic<String, PosInvoice> shipmentTopic = testDriver.createOutputTopic("shipment",
                Serdes.String().deserializer(),
                posInvoiceSerde.deserializer());

        PosInvoice posInvoiceIn = createPosInvoice("ignore",
                RjUseCaseTwoApplication.DELIVERY_TYPE_HOME_DELIVERY);

        posInvoiceTopic.pipeInput(posInvoiceIn.getStoreId().toString(), posInvoiceIn);
        PosInvoice posInvoiceOut = shipmentTopic.readValue();

        assertEquals(posInvoiceIn, posInvoiceOut);

//        assertAll(
//                () -> assertEquals(RjUseCaseTwoApplication.DELIVERY_TYPE_HOME_DELIVERY,
//                        record.value().getDeliveryType().toString())
//        );
    }

    @AfterEach
    public void tearDown() {
        try {
            testDriver.close();
        } catch (final RuntimeException e) {
            log.info("Ignoring , test failing in Windows due this exception:" + e.getLocalizedMessage());
        }
    }

    @AfterAll
    public static void shutDown() {

    }

    PosInvoice createPosInvoice(String customerType, String deliveryType) {
        PosInvoice inv = new PosInvoice();
        inv.setCreatedAt(LocalDate.now());
        String accountId = "ACC-1";
        inv.setInvoiceNo("INV-1");
        inv.setPosId("POS-1");
        inv.setStoreId("STORE_ID-1");
        inv.setCashierID("Cashier-1");
        inv.setCustomerType(customerType);
        inv.setPaymentMethod("PaymentMethod");
        inv.setCustomerCardNo("Card-1111");
        inv.setDeliveryType(deliveryType);
        inv.setDeliveryAddress(new Address("myAddressLine", "myContact"));
        List<Item> items = new ArrayList<>();
        inv.setInvoiceLineItems(items);
        return  inv;
    }
}