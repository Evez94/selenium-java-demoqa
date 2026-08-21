pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Evez94/selenium-java-demoqa.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t selenium-demoqa-tests .'
                }
            }
        }

        stage('Run Tests in Docker') {
            steps {
                script {
                    sh 'docker run --rm selenium-demoqa-tests'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline tamamlandı.'
        }
        success {
            echo 'Bütün Selenium testləri uğurla keçdi!'
        }
        failure {
            echo 'Testlərdə xəta baş verdi!'
        }
    }
}