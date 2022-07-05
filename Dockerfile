FROM openjdk:8-jdk-alpine
#COPY target/SpringMysqlDockerDemo-0.0.1-SNAPSHOT.jar .
ADD target/AWS-cloud-demo.jar AWS-cloud-demo.jar
ENTRYPOINT ["java", "-jar", "AWS-cloud-demo.jar"]