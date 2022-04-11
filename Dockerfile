FROM openjdk:19-jdk
COPY hello-world.jar /hello-world.jar
ENTRYPOINT [ "java", "-jar", "/hello-world.jar" ]
