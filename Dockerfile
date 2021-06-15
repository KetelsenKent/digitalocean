FROM openjdk:11-jdk
WORKDIR /
ADD src/jenkinsdemo-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 8080
CMD ["java", "-jar", "myapp.jar"]
