FROM java:8

# Set the working directory to '/opt/spring-boot' directory
WORKDIR /opt/spring-boot

# Expose the ports we're interested in
EXPOSE 8081

# Make Java 8 obey container resource limits, improve performance
ENV JAVA_OPTS='-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:+UseG1GC -Djava.awt.headless=true'

# Set the container up with an entrypoint so we can make sure any runtime
# customizations happen at the appropriate time.
COPY entrypoint.sh .
ENTRYPOINT ["/opt/spring-boot/entrypoint.sh"]
RUN chmod a+x entrypoint.sh

# Set the default command to run on boot
CMD java $JAVA_AGENT -jar nasabah-0.0.1-SNAPSHOT.jar
