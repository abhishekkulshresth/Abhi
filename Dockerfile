FROM openjdk:1.8

MAINTAINER abhishek<kulshresthaabhishek79@gmail.com>

COPY target/onetomanybidieractionalarray-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT["java", "-jar", "onetomanybidieractionalarray-0.0.1-SNAPSHOT.jar"]