FROM amazoncorretto:22-alpine-jdk                       //imagen de la que partimos
MAINTAINER TOMOKI                                       //Autor
COPY target/Tomoki-0.0.1-SNAPSHOT.jar tomoki-app.jar    //Copia el empaquetado a github
ENTRYPOINT ["java","-jar","/tomoki-app.jar"]            //Instrucción que se ejecuta primero
