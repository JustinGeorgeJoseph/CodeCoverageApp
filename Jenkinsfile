pipeline {
    agent any
    stages {

        stage('Clean Build') {
                steps {
                    echo 'Running Tests'
                    sh './gradlew clean --stacktrace'
                }
        }

         stage('Unit tests') {
            steps {
                sh './gradlew testDebugUnitTest'
            }
            post {
                always {
                    junit "**/build/test-results/**/*.xml"
                }
            }
        }

         stage('Jacoco code coverage') {
            steps {
                sh(script: "./gradlew jacocoTestReport", label: "Code coverage analysis")
             }
             post {
                always {
                    jacoco execPattern: '**/**.exec, **/jacoco/**.exec',
                    sourceExclusionPattern: '**/R.class, **/R$*.class, **/BuildConfig.*, **/Manifest*.* , **/*Test*.*, android/**/*.*, **/*Activity.*',
                    exclusionPattern: '**/BuildConfig.*, **/Manifest*.* , **/*Test*.*, android/**/*.*, **/*Activity.*',
                    classPattern: '**/classes, **/intermediates/javac/debug/classes, **/tmp/kotlin-classes/debug'
               }
             }
         }
    }
}