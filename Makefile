-include .env

JAR=rj-usecase-one-0.0.1-SNAPSHOT.jar
DF_OPT=-f docker-compose-6.1.1.yml
TOPIC=

.PHONY: kafka-up
kafka-up:
	echo -n "Starting confluent"
	docker-compose $(DF_OPT) up -d

.PHONY: kafka-down
kafka-down:
	echo -n "Stopping confluent"
	docker-compose $(DF_OPT) down

.PHONY: create-topics
create-topics:
	docker-compose $(DF_OPT) exec broker kafka-topics --create \
	--bootstrap-server localhost:9092 \
	--replication-factor 1 --partitions 1 \
	--topic user-clicks

	docker-compose $(DF_OPT) exec broker kafka-topics --create \
	--bootstrap-server localhost:9092 \
	--replication-factor 1 --partitions 1 \
	--topic user-regions

	docker-compose $(DF_OPT) exec broker kafka-topics --create \
	--bootstrap-server localhost:9092 \
	--replication-factor 1 --partitions 1 \
	--topic output-topic

.PHONY: list-topics
list-topics:
	docker-compose $(DF_OPT) exec broker kafka-topics --list --bootstrap-server localhost:9092

.PHONY: build-stream
build-stream:
	./mvnw clean package

start-stream:
	/bin/bash -c "java -jar target/$(JAR) &"

stop-stream:
	ps ax | grep java | grep -i '$(JAR)' | grep -v grep |  awk '{print $$1}' | xargs kill

start-producer:
	java -jar target/$(JAR) --produce

start-consumer:
	echo -c "** run make start-consumer in a new shell **"
	docker $(DF_OPT) exec -it broker kafka-console-consumer --bootstrap-server localhost:9092 \
		--topic output-topic \
		--key-deserializer org.apache.kafka.common.serialization.StringDeserializer  \
		--value-deserializer org.apache.kafka.common.serialization.LongDeserializer \
		--property print.key=true --property key.separator="-"

mysql-start:
	mysql.server start &

mysql-stop:
	mysql.server stop

data-gen-avro:
	[ -z $$CONFLUENT_HOME ] && echo "set up CONFLUENT_HOME env" && exit 1; \
	[ -z $$TOPIC ] && echo "make data-gen-avro TOPIC=order" && exit 1; \
	KSQL_JVM_PERFORMANCE_OPTS="-server -XX:NewRatio=1 -Djava.awt.headless=true"  \
	$(CONFLUENT_HOME)/bin/ksql-datagen schema=./src/test/resources/datagen/$(TOPIC).avro \
	 	format=avro topic=$(TOPIC) \
	 	key=AccountId iterations=100 msgRate=1

read-avro-console:
	[ -z $$TOPIC ] && echo "make read-avro-console TOPIC=order" && exit 1; \
	$(CONFLUENT_HOME)/bin/kafka-avro-console-consumer --bootstrap-server localhost:9092 \
		--topic $(TOPIC)

.PHONY: data-gen read-avro-console mysql-stop mysql-start start-consumer start-producer stop-stream start-stream