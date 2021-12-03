FROM openjdk:11-jdk
LABEL PROJECT_NAME=bookInfo \
      PROJECT=bookInfo

COPY target/bookInfo-0.0.1-SNAPSHOT.jar  bookInfo.jar
EXPOSE 8078 8078
ENTRYPOINT ["java","-jar","/bookInfo.jar"]