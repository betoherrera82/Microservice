pipeline {
  agent any
  stages {
    stage('Quality Analisys') {
      agent any
      environment {
        withSonarQubeEnv = 'SQ_Dev'
      }
      steps {
        waitForQualityGate true
      }
    }
  }
}