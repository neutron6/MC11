FROM openjdk:8
EXPOSE 8089
ADD target/dockerlauncher-3.1.7-SNAPSHOT.jar dockerlauncher-3.1.7-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/dockerlauncher-3.1.7-SNAPSHOT.jar"] 