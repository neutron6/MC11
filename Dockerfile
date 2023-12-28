FROM openjdk:8
EXPOSE 8089
ADD target/dockerlauncher-3.1.7-SNAPSHOT-jar-with-dependencies.jar dockerlauncher-3.1.7-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java", "-jar", "/dockerlauncher-3.1.7-SNAPSHOT-jar-with-dependencies.jar"] 