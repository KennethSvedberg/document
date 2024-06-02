FROM openjdk:21
WORKDIR /app
COPY target/api-service-document-2.0.jar ./document.jar
EXPOSE 8081

CMD ["java", "-jar", "document.jar"]