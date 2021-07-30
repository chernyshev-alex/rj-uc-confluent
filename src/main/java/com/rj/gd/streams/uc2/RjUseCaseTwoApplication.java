package com.rj.gd.streams.uc2;

import com.rj.gd.streams.uc2.types.gen.Notification;
import com.rj.gd.streams.uc2.types.gen.PosInvoice;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@Log4j2
@SpringBootApplication
public class RjUseCaseTwoApplication {

	private static final String SHIPMENT_TOPIC = "shipment";
	private static final String NOTIFICATION_TOPIC = "notification";
	public static final String DELIVERY_TYPE_HOME_DELIVERY = "HOME-DELIVERY";
	public static final String CUSTOMER_TYPE_PRIME = "PRIME";

	public static void main(String[] args) {
		SpringApplication.run(RjUseCaseTwoApplication.class, args);
	}
//
//	@Bean
//	public Consumer<KStream<String, PosInvoice>> process() {
//		return input -> {
//			input.peek((key, order) -> {
//				log.info("consumer: enriched {}/{}", key, order);
//			});
//		};
//	}

//	@Bean
//	public Consumer<KStream<String, PosInvoice>> process() {
//		return input -> {
//			input.filter((k, v) -> {
//				log.info("== process 1 {}", input);
//				return v.getDeliveryType().toString().equalsIgnoreCase(DELIVERY_TYPE_HOME_DELIVERY);
//			}).to(SHIPMENT_TOPIC);

//			input.filter((k, v) -> {
//				log.info("== process 2 {}", input);
//				return v.getCustomerType().toString().equalsIgnoreCase(CUSTOMER_TYPE_PRIME);
//			}).mapValues(v -> RecordBuilder.getNotification(v))
//					.to(NOTIFICATION_TOPIC,
							// ??, Produced.with(AppSerdes.String(), AppSerdes.Notification())
//							Produced.with(Serdes.String(),
//									new SpecificAvroSerde<Notification>()));
//		};
//	}

	@Bean
	public Function<KStream<String, PosInvoice>, KStream<String, PosInvoice>> process() {
		return input -> input.filter((k, v) -> {
			log.info("== process {}/{}", k, v);
			return v.getDeliveryType().toString().equalsIgnoreCase(DELIVERY_TYPE_HOME_DELIVERY);
				}
		);
	}

	@Bean
	public Function<KStream<String, PosInvoice>, KStream<String, Notification>> notifyPrime() {
		return input -> input.filter((k, v) -> {
			log.info("== notifyPrime {}/{}", k, v);
			return v.getCustomerType().toString().equalsIgnoreCase(CUSTOMER_TYPE_PRIME);
		}).mapValues(v -> RecordBuilder.getNotification(v));
	}

	@Bean
	public Consumer<KStream<String, PosInvoice>> shipment() {
		return input -> {
			input.peek((key, value) -> {
				log.info("== shipment {}/{}", key, value);
			});
		};
	}

	@Bean
	public Consumer<KStream<String, Notification>> notifySinker() {
		return input -> {
			input.peek((key, value) -> {
				log.info("== got notifyPrime {}/{}", key, value);
			});
		};
	}

	@Bean
	public Serde<PosInvoice> avroInSerdePosInvoice(){
		final SpecificAvroSerde<PosInvoice> avroInSerde = new SpecificAvroSerde<>();
		//Map<String, Object> serdeProperties = new HashMap<>();
		return avroInSerde;
	}

	@Bean
	public Serde<Notification> avroInSerdeNotification(){
		final SpecificAvroSerde<Notification> avroInSerde = new SpecificAvroSerde<>();
		//Map<String, Object> serdeProperties = new HashMap<>();
		return avroInSerde;
	}

	//@Bean
//	public Supplier<Message<PosInvoice>> supplier() {
//		return () -> {
//			PosInvoice invoice = newInvoice();
//			// custom partitioning to make cache more effective
//			return MessageBuilder.withPayload(invoice)
//					.setHeader("partitionKey", invoice.getPosId())
//					.build();
//		};
//	}
}
