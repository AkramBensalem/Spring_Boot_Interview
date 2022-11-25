FROM openjdk:17-jdk-alpine
COPY out/artifacts/ms_devices_jar/ms-devices.jar ms-devices.jar
ENTRYPOINT ["java","-jar","/ms-devices.jar"]
EXPOSE 8092