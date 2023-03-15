pipeline {

    agent any
    environment
    {
        registry = "maninandadeep/scientific_calculator"
        registryCredential = "dockerhub"
        dockerImage = ""
    }
    stages {
        stage('Git pull stage') {
            steps {
                // Get some code from a GitHub repository
                git url: 'https://github.com/ManiNandadeep/SPE_miniproject', branch: 'master'
            }
        }
        stage('Maven Build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Maven test'){
            steps {
                script{
                    sh 'mvn clean test'
                }
            }
        }
        stage('Docker Build To Image') {
            steps {
              script{
                  dockerImage = docker.build registry + ":latest"
              }
            }
        }
        //  stage('Push Docker Image') {
        //     steps {
        //         script{
        //             docker.withRegistry('','docker-jenkins'){
        //             imageName.push()
        //             }
        //         }
        //     }

        //  }
        // stage('Ansible Pull Docker Image') {
        //     steps {
        //       ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/deploy-image.yml', sudoUser: null
        //     }

        // }
        
    }
}