pipeline {
    agent any
    options {
        // Timeout counter starts AFTER agent is allocated
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {

    stage('Clean project') {
                steps {
                    container('android') {
                        sh """
                        ./gradlew clean
                        rm -rf CodeCoverageTest/build/
                        """
                    }
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