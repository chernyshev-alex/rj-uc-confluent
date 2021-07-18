# ##############################################
#  1 termianl 1 : make kafka-up start-stream
#  2 terminal 2 : make start-consumer
#  3 terminal 1 : make start-producer

JAR=rj-usecase-one-0.0.1-SNAPSHOT.jar

.PHONY: kafka-up
kafka-up:
	echo -n "Starting confluent"
	docker-compose up -d

.PHONY: kafka-down
kafka-down:
	echo -n "Stopping confluent"
	docker-compose down

.PHONY: create-topics
create-topics:
	docker-compose exec broker kafka-topics --create \
	--bootstrap-server localhost:9092 \
	--replication-factor 1 --partitions 1 \
	--topic user-clicks

	docker-compose exec broker kafka-topics --create \
	--bootstrap-server localhost:9092 \
	--replication-factor 1 --partitions 1 \
	--topic user-regions

	docker-compose exec broker kafka-topics --create \
	--bootstrap-server localhost:9092 \
	--replication-factor 1 --partitions 1 \
	--topic output-topic

.PHONY: list-topics
list-topics:
	docker-compose exec broker kafka-topics --list --bootstrap-server localhost:9092

.PHONY: build-stream
build-stream:
	./mvnw clean package

.PHONY: start-stream
start-stream:
	/bin/bash -c "java -jar target/$(JAR) &"

.PHONY: stop-stream
stop-stream:
	ps ax | grep java | grep -i '$(JAR)' | grep -v grep |  awk '{print $$1}' | xargs kill

.PNONY: start-producer
start-producer:
	java -jar target/$(JAR) --produce

.PHONY: start-consumer
start-consumer:
	echo -c "** run make start-consumer in a new shell **"
	docker exec -it broker kafka-console-consumer --bootstrap-server localhost:9092 \
		--topic output-topic \
		--key-deserializer org.apache.kafka.common.serialization.StringDeserializer  \
		--value-deserializer org.apache.kafka.common.serialization.LongDeserializer \
		--property print.key=true --property key.separator="-"

.PHONY: mysql-start
mysql-start:
	mysql.server start &

.PHONY: mysql-stop
mysql-stop:
	mysql.server stop
