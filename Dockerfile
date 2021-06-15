FROM java:8
WORKDIR /
ADD build/libs/jenkinsdemo-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 8080
CMD ["java", "-jar", "myapp.jar"]