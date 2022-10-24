FROM openjdk:8
EXPOSE 9999
ADD target/apiGateway-1.0.jar apiGateway-1.0.jar
ENTRYPOINT ["java","-jar" , "apiGateway-1.0.jar" ]