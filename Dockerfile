FROM openjdk:22-slim AS builder
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:22-slim
COPY target/Tomoki-0.0.1-SNAPSHOT.jar Tomoki.jar
EXPOSE 8080 
ENTRYPOINT ["java","-jar","/Tomoki.jar"]
