FROM openjdk:17

COPY target/ssn-api.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "ssn-api.jar"]


