pipeline {
  agent any
  stages {
    stage('Quality Analisys') {
      steps {
        waitForQualityGate true
      }
    }
  }
}