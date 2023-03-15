FROM openjdk:11
WORKDIR ./
COPY  ./target/miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java","-jar","miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]

#every line in docker file is layer of image