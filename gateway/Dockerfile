FROM openjdk:17-jdk-alpine
COPY out/artifacts/gateway_jar/gateway.jar gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]
EXPOSE 7777