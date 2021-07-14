
# rj-uc-confluent

tested with Confluent 6.1.1 !

pom file has correct dependency for 
  java 11, spring-boot 2.4.6, spring-cloud-stream 3.1.2
  kafka 2.1.0 - confluent 6.1.1-ccs
  kafka-clients 6.1.1-ccs, kafka-streams 6.1.1-ccs
  kafka-streams-avro-serde 6.1.1 - avro 1.10.2

1. start docker-compose-6.1.1.yml
2. java -jar target/rj-usecase-one-0.0.1-SNAPSHOT.jar

