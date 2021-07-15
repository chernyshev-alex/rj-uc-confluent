package com.rj.gd.streams.uc1;

import com.rj.gd.streams.uc1.types.Order;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.streams.KeyValue;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.*;

public class GoldenGateProducer {

    public static void main(String... args) {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(1000);
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

        DefaultKafkaProducerFactory<String, Order> pf = new DefaultKafkaProducerFactory<>(props);
        KafkaTemplate<String, Order> template = new KafkaTemplate<>(pf, true);
        template.setDefaultTopic("foo-1");

        Random r = new Random();

        String[] tickers = { "IBM" , "AAPL", "CSCO", "AMD" };

        List<KeyValue<String, Order>>  orders =  new LinkedList<>();
        for (int i = 0; i < 1 ; i++) {
            Order o = new Order(Integer.toString(r.nextInt(100))
                    , tickers[r.nextInt(4)]
                    , r.nextInt(10), (float) 0.0, (float) 0.0);
            orders.add(new KeyValue<String, Order>(o.getAccountId().toString(), o));
        }

        for (KeyValue<String,Order> keyValue : orders) {
            template.sendDefault(keyValue.key, keyValue.value);
        }
    }
}
