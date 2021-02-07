FROM openjdk:8
ADD target/nasabah-0.0.1-SNAPSHOT.jar nasabah.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","nasabah.jar"]
