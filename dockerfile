FROM openjdk:11
 #openjdk:11-jdk-alpine

EXPOSE 8080
VOLUME /tmp
ADD ./target/demo-docker-volumes-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

