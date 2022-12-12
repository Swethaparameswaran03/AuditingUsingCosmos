FROM openjdk:11
EXPOSE 8080
ADD target/producer-0.0.1-SNAPSHOT.jar producer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar producer-0.0.1-SNAPSHOT.jar"]
