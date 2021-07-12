package com.rj.gd.streams.uc1;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.Joined;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import java.util.function.BiFunction;

// https://www.confluent.io/blog/spring-for-apache-kafka-deep-dive-part-2-apache-kafka-spring-cloud-stream/

@SpringBootApplication
public class RjUseCaseOneApplication {

	public static void main(String[] args) {
		for (String a: args) {
			if ("--produce".equalsIgnoreCase(a)) {
				Producers.main(args);
				return;
			}
		}
		SpringApplication.run(RjUseCaseOneApplication.class, args);
	}

	public static class KStreamToTableJoinApplication {
		@Bean
		public BiFunction<KStream<String, Long>, KTable<String, String>, KStream<String, Long>> process() {
			return (userClicksStream, userRegionsTable) -> userClicksStream
					.leftJoin(userRegionsTable,
							(clicks, region) -> new RegionWithClicks(region == null ? "UNKNOWN" : region, clicks),
							Joined.with(Serdes.String(), Serdes.Long(), null))
					.map((user, regionWithClicks) -> new KeyValue<>(regionWithClicks.getRegion(), regionWithClicks.getClicks()))
					.groupByKey(Grouped.with(Serdes.String(), Serdes.Long()))
					.reduce((firstClicks, secondClicks) -> firstClicks + secondClicks)
					.toStream();
		}
	}

	private static final class RegionWithClicks {
		private final String region;
		private final long clicks;

		public RegionWithClicks(String region, long clicks) {
			if (region == null || region.isEmpty()) {
				throw new IllegalArgumentException("region must be set");
			}
			if (clicks < 0) {
				throw new IllegalArgumentException("clicks must not be negative");
			}
			this.region = region;
			this.clicks = clicks;
		}

		public String getRegion() {
			return region;
		}

		public long getClicks() {
			return clicks;
		}
	}
}
