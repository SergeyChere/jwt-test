FROM openjdk
ADD target/demo-0.0.1-SNAPSHOT.jar swapper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "swapper.jar"]