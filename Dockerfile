FROM openjdk
RUN apt -y install tree
RUN ["tree"]
COPY /var/lib/jenkins/workspace/MiniProject/target/SPE_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","/var/lib/jenkins/workspace/MiniProject/SPE_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar","SPE_miniproject"]
