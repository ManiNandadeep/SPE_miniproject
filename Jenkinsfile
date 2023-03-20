pipeline {

    agent any
    stages {
        stage('Git pull stage') {
            steps {
                git url: 'https://github.com/ManiNandadeep/SPE_miniproject', branch: 'master'
            }
        }
        stage('Maven Test') {
            steps {
                script{
                    sh 'mvn clean test'
                }
            }
        }
        stage('Maven install'){
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Build Docker image') {
            steps {
              script{

                    sh 'docker build -t maninandadeep/scientific_calculator:latest .'
              }
            }
        }
         stage('Push Docker Image') {
            steps {
                script{
                        withDockerRegistry([ credentialsId: "dockerhubid", url: "" ])
                        {
                            sh 'sudo docker push maninandadeep/scientific_calculator:latest'
                        }
                    }
                }
            }
         }
}