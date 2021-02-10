FROM java:8
VOLUME /tmp
ADD /maven/${JAR_FILE_NAME}.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
