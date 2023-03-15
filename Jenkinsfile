pipeline {

    agent any
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
        stage('Build Docker image') {
            steps {
              script{
                    sh 'docker build -t maninandadeep/scientific_calculator .'
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