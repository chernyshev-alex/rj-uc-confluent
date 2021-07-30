package com.rj.gd.streams.uc2;

import com.rj.gd.streams.uc2.types.gen.Address;
import com.rj.gd.streams.uc2.types.gen.Item;
import com.rj.gd.streams.uc2.types.gen.PosInvoice;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.streams.KeyValue;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDate;
import java.util.*;

public class PosInvoiceProducer {
    public static void main(String... args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            runLoop();
        }
    }

    public static void runLoop() {

        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put("schema.registry.url", "http://localhost:8081");

        DefaultKafkaProducerFactory<String, PosInvoice> pf = new DefaultKafkaProducerFactory<>(props);
        KafkaTemplate<String, PosInvoice> template = new KafkaTemplate<>(pf, true);
        template.setDefaultTopic("posinvoice");

        for (int i = 0; i < 1; i++) {
            PosInvoice invoice = newInvoice();
            // System.out.println("***** invoice : " + invoice);
            KeyValue<String, PosInvoice> kv =
                    new KeyValue<>(invoice.getStoreId().toString(), invoice);
            template.sendDefault(kv.key, kv.value);
        }
    }

    public static PosInvoice newInvoice() {
        PosInvoice inv = new PosInvoice();
        inv.setCreatedAt(LocalDate.now());
        String accountId = Integer.toString(random.nextInt(10));
        inv.setInvoiceNo("INV-" + Integer.toString(random.nextInt(10)));
        inv.setPosId("POS-" + Integer.toString(random.nextInt(10)));
        inv.setStoreId("STOREID-" + Integer.toString(random.nextInt(4)));
        inv.setCashierID("Cashier-1");
        inv.setCustomerType(RjUseCaseTwoApplication.CUSTOMER_TYPE_PRIME);
        inv.setPaymentMethod("PaymentMethod");
        inv.setCustomerCardNo("Card-1111");
        inv.setDeliveryType(RjUseCaseTwoApplication.DELIVERY_TYPE_HOME_DELIVERY);
        inv.setDeliveryAddress(new Address("myAddressLine", "myContact"));
        List<Item> items = new ArrayList<>();
        inv.setInvoiceLineItems(items);
        return  inv;
    }

    static Random random = new Random();
}
