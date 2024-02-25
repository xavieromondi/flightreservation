FROM openjdk:17-jdk-alpine
COPY target/flightreservation-0.0.1-SNAPSHOT.jar flightreservation.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","flightreservation.jar"]
