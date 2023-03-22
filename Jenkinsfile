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
        stage('Docker Build Image')
        {
            steps{
                script{
                    imageName = docker.build "maninandadeep/scientific_calculator:latest"
                }
            }
        }
        stage('Push Docker Image')
        {
            steps{
                script{
                    docker.withRegistry("", 'dockerhubid' ){
                        imageName.push()
                    }
                }
            }
        }
        stage('Ansible pull docker image')
        {
            steps{
                sh "/usr/bin/pip3 install docker"
                sh "ansible-playbook p2.yml -i inventory"
            }
        }
    }
}