#Where we start
FROM java:8


#Get APK up to date
RUN apk update && apk upgrade

#Install Maven
RUN apk add maven

EXPOSE 8081

#Git
RUN apk add git
RUN mkdir /BANK-AZI
RUN git clone https://github.com/azibri/BANK-AZI.git /BANK-AZI

#Build
RUN mvn -f /BANK-AZI clean install

#Save result
RUN mkdir /Executables
RUN cp -r /HungryBoiiGit/target/BANK-AZI-distributable/* /Executables

#Remove Git repo
RUN rm -rf /BANK-AZI

#Define how to start
WORKDIR /Executables
ENTRYPOINT ["java", "-jar", "nasabah-0.0.1-SNAPSHOT.jar"]

