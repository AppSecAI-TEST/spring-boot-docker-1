FROM java:8-alpine

RUN mkdir /app
WORKDIR /app
ADD target/docker-demo.jar /app

EXPOSE 9001
ENTRYPOINT ["java","-jar","docker-demo.jar"]