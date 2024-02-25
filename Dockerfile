FROM openjdk:17-jdk-alpine
COPY target/flightreservation-0.0.1-SNAPSHOT.jar flightreservation-1.0.0.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/flightreservation-0.0.1-SNAPSHOT.jar "]
