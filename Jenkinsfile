node {
   stage('Clone Repository') {
        git 'https://github.com/betoherrera82/Microservice.git'
   }

   stage('Build Maven Image') {
        docker.build("maven-build")
   }
   
   stage('Run Maven Container') {
   		sh "docker rm maven-build-container"
        sh "docker run --name maven-build-container maven-build"
   }
   
   stage('Deploy Spring Boot Application') {
   		sh "docker stop java-deploy-container"
   		sh "docker rm java-deploy-container"
        sh "docker run --name java-deploy-container --volumes-from maven-build-container -d -p 9100:9000 java-deploy"
   }
}
