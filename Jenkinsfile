pipeline {
  agent node {

   stage('Clone Repository') {
        git 'https://github.com/denisdbell/spring-petclinic.git'
    
   }
   stage('Build Maven Image') {
        docker.build("maven-build")
   }
   
   stage('Run Maven Container') {
       
        sh " docker rm -f maven-build-container"
        
        sh "docker run --rm --name maven-build-container maven-build"
   }
   
   stage('Deploy Spring Boot Application') {
        
        sh " docker rm -f java-deploy-container"
       
        sh "docker run --name java-deploy-container --volumes-from maven-build-container -d -p 9100:9000 java-deploy"
   }

}

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