pipeline {
  agent any
  stages {
    stage('Quality analysis') {
      environment {
        withSonarQubeEnv = 'SQ'
      }
      steps {
        waitForQualityGate true
      }
    }
  }
}