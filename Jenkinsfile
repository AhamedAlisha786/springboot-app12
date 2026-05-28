pipeline {
    agent {
        label 'dev'
    }

    stages {

        stage('Clone Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/AhamedAlisha786/springboot-app12.git'
            }
        }

        stage('Build Docker Images') {
            steps {
                sh 'sudo docker build -t frontend:1 ./Tracker_FrontEnd'
                sh 'sudo docker build -t backend:1 ./TrackerBackend'
            }
        }

        stage('Deploy Frontend') {
            steps {
                sh 'sudo kubectl apply -f Tracker_FrontEnd/Deployment.yml'
                sh 'sudo kubectl apply -f Tracker_FrontEnd/Service.yml'
            }
        }

        stage('Deploy Backend') {
            steps {
                sh 'sudo kubectl apply -f TrackerBackend/Deployment.yml'
                sh 'sudo kubectl apply -f TrackerBackend/Service.yml'
            }
        }

        stage('Verify') {
            steps {
                sh 'sudo kubectl get pods'
                sh 'sudo kubectl get svc'
            }
        }
    }
}
