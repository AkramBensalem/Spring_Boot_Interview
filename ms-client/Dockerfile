FROM openjdk:17-jdk-alpine
COPY out/artifacts/ms_client_jar/ms-client.jar ms-client.jar
ENTRYPOINT ["java","-jar","/ms-client.jar"]
EXPOSE 8091