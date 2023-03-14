FROM openjdk:11
COPY  ./target/miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]

#every line in docker file is layer of image