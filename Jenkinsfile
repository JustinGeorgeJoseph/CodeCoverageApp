pipeline {
    agent any
    options {
        // Timeout counter starts AFTER agent is allocated
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {

        stage('Clean Build') {
                steps {
                    echo 'Running Tests'
                    sh './gradlew clean -stacktrace'
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