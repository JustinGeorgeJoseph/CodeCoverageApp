pipeline {
    agent any
    options {
        // Timeout counter starts AFTER agent is allocated
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {

    stage('Clean project') {
                        stage('Clean Build') {
                                dir("android") {

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