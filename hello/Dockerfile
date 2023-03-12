FROM openjdk:17-jdk-alpine
EXPOSE 8002
ADD target/hello-app.jar hello-app.jar
ENTRYPOINT ["java","-jar","/hello-app.jar"]
