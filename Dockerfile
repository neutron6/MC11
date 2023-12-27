FROM openjdk:8
EXPOSE 8089
ADD ./target/*.jar mc11parent-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java", "-jar", "/mc11parent-1.0-SNAPSHOT-jar-with-dependencies.jar"] 