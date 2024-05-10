FROM openjdk:22-slim AS builder
COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:22-slim
EXPOSE 8080 
COPY target/Tomoki-0.0.1-SNAPSHOT.jar /Tomoki.jar
ENTRYPOINT ["java","-jar","/Tomoki.jar"]
