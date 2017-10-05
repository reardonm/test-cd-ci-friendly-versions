pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        readYaml(file: 'docker-compose.yml')
        script {
          echo yml
        }
        
      }
    }
  }
}