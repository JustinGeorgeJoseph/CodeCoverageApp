pipeline {
    agent any
    stages {
        stage('Clean Build') {
                steps {
                    echo 'Running Tests'
                    sh './gradlew clean -stacktrace'
                }
        }
    }
}