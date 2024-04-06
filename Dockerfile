FROM amazoncorretto:11-alpine-jdk                      
MAINTAINER TOMOKI                                       
COPY target/Tomoki-0.0.1-SNAPSHOT.jar tomoki-app.jar   
EXPOSE 8080
ENTRYPOINT ["java","-jar","/tomoki-app.jar"]           
