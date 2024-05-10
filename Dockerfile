FROM openjdk:22-slim AS builder
# Establecer un directorio de trabajo
WORKDIR /app

# Copiar archivos de tu proyecto al directorio de trabajo
COPY . /app

RUN mvn clean package -DskipTests

FROM openjdk:22-slim
EXPOSE 8080 
COPY --from=build target/Tomoki-0.0.1-SNAPSHOT.jar /Tomoki.jar
ENTRYPOINT ["java","-jar","/Tomoki.jar"]
