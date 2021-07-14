package com.rj.gd.streams.uc1;

import com.rj.gd.streams.uc1.types.Order;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
//@EnableSchemaRegistryClient
public class RjUseCaseOneApplication {

	private Random random = new Random();

	static Logger logger = LoggerFactory.getLogger(RjUseCaseOneApplication.class);

	public static void main(String[] args) {
		for (String a: args) {
			if ("--produce".equalsIgnoreCase(a)) {
					Producers.main(args);
				return;
			}
		}
		SpringApplication.run(RjUseCaseOneApplication.class, args);
	}

//  it doesn't work
//	@Bean
//	public Consumer<Order> process()  {
//		return (input) -> {
//			logger.info("input: " + input);
//		};
//	}

	@Bean
	public Consumer<KStream<Order, Order>> process(){
		return input -> {
			input.peek(((key, value) ->
					System.out.println(" value: "+value.toString())));
		};
	}

	@Bean
	public Serde<Order> avroInSerde(){
		final SpecificAvroSerde<Order> avroInSerde = new SpecificAvroSerde<>();
		Map<String, Object> serdeProperties = new HashMap<>();
		return avroInSerde;
	}

	@Bean
	public Supplier<Order> supplier() {
		return () -> {
			logger.info("called  supplier");
			Order order = new Order();
			order.setId(UUID.randomUUID().toString() + "-v1");
			order.setSize(1);
			order.setTicker ("IBM");
			return order;
		};
	}
}
