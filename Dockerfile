FROM openjdk:8-jdk-alpine

LABEL maintainer="lak1357@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/user-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} user-service.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/user-service.jar"]