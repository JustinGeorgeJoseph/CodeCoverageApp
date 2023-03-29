pipeline {
    agent any
    stages {
        stage('Clean Build') {
                steps {
                    echo 'Running Tests'
                    sh './gradlew clean -stacktrace'
                }
        }

/*         stage('Unit tests') {
            steps {
                sh './gradlew testDebugUnitTest'
            }
            post {
                always {
                    junit "**//* build/test-results *//** /* *//*.xml"
                }
            }
        } */

/*          stage('Jacoco code coverage') {
             steps {
                 sh './gradlew jacocoTestReport'
             }
             post {
                 always {
                     jacoco classPattern: '**//* intermediates/javac/debug/classes,**//* tmp/kotlin-classes/debug', sourceExclusionPattern: '**//* R.class, **//* R$*.class, **//* BuildConfig.*, **//* Manifest*.*, ** /* *//*Test*.*, android *//** /* *//*.*, ** /* *//*Activity.*'
                 }
             }
         } */

    }
}