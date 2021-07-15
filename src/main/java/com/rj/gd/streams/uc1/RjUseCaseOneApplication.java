package com.rj.gd.streams.uc1;

import com.rj.gd.streams.uc1.types.Order;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Log4j2
@SpringBootApplication
public class RjUseCaseOneApplication {

	Random random = new Random();

	@Autowired
	LookupService lookupService;

	public static void main(String[] args) {
		for (String a: args) {
			if ("--produce".equalsIgnoreCase(a)) {
					Producers.main(args);
				return;
			}
		}
		SpringApplication.run(RjUseCaseOneApplication.class, args);
	}

	// Stream

	@Bean
	public Consumer<KStream<Order, Order>> process() {
		return input -> {
			input.peek((key, value) -> {
				String ticker = value.getTicker().toString();
				// get data from cache or db
				LookupService.TickerInfo info = lookupService.getData(ticker);
				if (info == null) {
					return;
				};
				// enrich order
				Order order  = value;
				order.setOpen(info.getOpen());
				order.setClose(info.getClose());
				log.info("consumer: enriched  {}/{}" , key, order);
			});
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
		String[] tickers = { "IBM" , "AAPL", "CSCO", "AMD" };
		return () -> {
			Order order = new Order();
			String accountId = Integer.toString(random.nextInt(100));
			order.setAccountId(accountId); //UUID.randomUUID().toString() + "-v1");
			order.setSize(random.nextInt(10));
			order.setTicker (tickers[random.nextInt(4)]);
			return order;
		};
	}

	// Partition
	// https://docs.spring.io/spring-cloud-stream-binder-kafka/docs/3.0.10.RELEASE/reference/html/spring-cloud-stream-binder-kafka.html#_partition_support_on_the_outbound
//	@Bean
//	public StreamPartitioner<String, Order> streamPartitioner() {
//
//	}
}
