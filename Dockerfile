FROM amazoncorretto:22-alpine-jdk                      
MAINTAINER TOMOKI                                       
COPY target/Tomoki-0.0.1-SNAPSHOT.jar tomoki-app.jar   
ENTRYPOINT ["java","-jar","/tomoki-app.jar"]           
