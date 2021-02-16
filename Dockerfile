FROM openjdk:8-jdk-alpine

COPY --from=build /home/app/target/nasabah-0.0.1-SNAPSHOT.jar /usr/local/lib/nasabah-0.0.1-SNAPSHOT.jar
EXPOSE 8081

ENTRYPOINT ["java","-jar","/usr/local/lib/nasabah-0.0.1-SNAPSHOT.jar"]
