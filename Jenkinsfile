pipeline {
  agent any
  stages {
    stage('Quality Analisys') {
      environment {
        withSonarQubeEnv = 'SQ_Dev'
      }
      steps {
        waitForQualityGate true
      }
    }
  }
}