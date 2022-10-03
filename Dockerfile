FROM openjdk:8-jdk-alpine
MAINTAINER counter-assignment
COPY ./target/counter-assignment-0.0.1-SNAPSHOT.jar counter-assignment-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/counter-assignment-0.0.1-SNAPSHOT.jar"]