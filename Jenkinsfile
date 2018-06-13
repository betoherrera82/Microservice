pipeline {
  agent any
  stages {
    stage('Quality analysis') {
      agent any
      steps {
      	withSonarQubeEnv('SQ') {
      	    sh 'mvn clean package sonar:sonar'
      	} 
      }
    }
    stage('Quality gate') {
    	agent any
    	steps {
    	   waitForQualityGate false   
    	}
    }
  }
}