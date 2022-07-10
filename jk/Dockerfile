FROM openjdk:8
EXPOSE 9090
ADD target/jk.jar jk.jar
ENTRYPOINT ["java","-jar","jk.jar"]