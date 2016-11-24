node {
  stage('Checkout'){
  checkout scm
 }
  env.PATH = "${tool 'maven-3.3.9'}/bin:${env.PATH}"
  stage('Package') {
    dir('webapp') {
      sh 'mvn clean package -DskipTests'
    }
  }

  stage('Create Docker Image') {
    dir('webapp') {
      docker.build("uday1bhanu/docker-jenkins-pipeline:${env.BUILD_NUMBER}")
    }
  }

  stage ('Run Application') {
    try {
      // Run application using Docker image
      //sh "DB=`docker inspect --format='{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' db`"
      sh "docker run uday1bhanu/docker-jenkins-pipeline:${env.BUILD_NUMBER}"

      // Run tests using Maven
      //dir ('webapp') {
      //  sh 'mvn exec:java -DskipTests'
      //}
    } catch (error) {
    } finally {
      // Stop and remove database container here
    }
  }

  stage('Run Tests') {
    try {
      dir('webapp') {
        sh "mvn test"
        def appImg = docker.build("uday1bhanu/docker-jenkins-pipeline:${env.BUILD_NUMBER}")
	docker.withRegistry('https://registry.hub.docker.com', 'uday-docker-hub'){
		appImg.push();
	}
      }
    } catch (error) {

    } finally {
      junit '**/target/surefire-reports/*.xml'
    }
  }
}
