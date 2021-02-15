FROM maven:3.3-jdk-8-onbuild 

FROM openjdk:8
EXPOSE 8081
COPY --from=0 /usr/src/app/target/nasabah-0.0.1-SNAPSHOT.jar /opt/demo.jar
CMD ["java","-jar","/opt/demo.jar"]