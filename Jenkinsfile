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
    	timeout(time: 10, unit: 'MINUTES') {
			def qg = waitForQualityGate()
    	                            
			if (qg.status != 'OK') {
				error "Pipeline aborted due to quality gate failure: ${qg.status}"                     
			}
    	}
    }
  }
}