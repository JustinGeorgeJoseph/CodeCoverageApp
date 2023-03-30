pipeline {
    agent any
    stages {

        stage('Clean Build') {
                steps {
                    echo 'Running Tests'
                    sh './gradlew clean -stacktrace'
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
                 sh './gradlew jacocoTestReport'
             }
             post {
                always {
                    jacoco execPattern: '**/**.exec,**/jacoco/**.exec'
                    //jacoco buildOverBuild: true, deltaBranchCoverage: '100', deltaClassCoverage: '70', deltaComplexityCoverage: '70', deltaLineCoverage: '70', deltaMethodCoverage: '70',  classPattern: '**/classes, **/intermediates/javac/debug/classes,**/tmp/kotlin-classes/debug', execPattern: '**/**.exec, **/jacoco/**.exec,**/outputs/code_coverage/debugAndroidTest/connected/**/*.ec', sourceExclusionPattern: '**/R.class, **/R$*.class, **/BuildConfig.*, **/Manifest*.* , **/*Test*.*, android/**/*.*, **/*Activity.*', sourceInclusionPattern: '**/*.java,**/*.kt,**/*.kts'
                }
             }
         }
    }
}