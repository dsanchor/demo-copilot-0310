FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/demo0310-0.0.1-SNAPSHOT.jar /app/demo0310.jar

EXPOSE 8080

CMD ["java", "-jar", "demo0310.jar"]
