FROM openjdk
RUN apt -y install tree
CMD ["tree"]
COPY ./target/SPE_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","SPE_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar","SPE_miniproject"]
