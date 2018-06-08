pipeline {
  agent any
  stages {
    stage('Quality analysis') {
      steps {
        waitForQualityGate true
      }
    }
  }
  environment {
    withSonarQubeEnv = 'SQ_Dev'
  }
}