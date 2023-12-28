FROM openjdk:8
EXPOSE 8089
ADD target/mc11parent-1.0-snapshot-jar-with-dependencies.jar mc11parent-1.0-snapshot-jar-with-dependencies.jar
ENTRYPOINT ["java", "-jar", "/mc11parent-1.0-snapshot-jar-with-dependencies.jar"] 