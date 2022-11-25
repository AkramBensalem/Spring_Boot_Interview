FROM openjdk:17-jdk-alpine
COPY out/artifacts/ms_registry_jar/ms-registry.jar ms-registry.jar
ENTRYPOINT ["java","-jar","/ms-registry.jar"]
EXPOSE 8888