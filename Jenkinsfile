pipeline {
    agent any
    options {
        // Timeout counter starts AFTER agent is allocated
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {

        stage('Clean Build') {
                dir("android") {
                    sh "pwd"
                    sh 'ls -al'
                    sh './gradlew clean'
                }
        }

        stage('Example') {
            steps {
                echo 'Hello World'
            }

            post {
                 always {
                  echo 'Hello World'
                 }
            }
        }
    }
}