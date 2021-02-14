FROM java:8
EXPOSE 8081
RUN mvn spring-boot:build-image
