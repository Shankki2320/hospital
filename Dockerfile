FROM openjdk:17
COPY target/hospital-0.0.1-SNAPSHOT.jar hospital-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/hospital-0.0.1-SNAPSHOT.jar"]