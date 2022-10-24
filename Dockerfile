FROM openjdk:8
EXPOSE 8761
ADD target/eurekaService-1.0.jar eurekaService-1.0.jar
ENTRYPOINT ["java","-jar" , "eurekaService-1.0.jar" ]