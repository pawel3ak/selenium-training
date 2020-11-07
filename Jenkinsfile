pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/pawel3ak/selenium-training.git', branch: 'master')
      }
    }

    stage('Maven build') {
      steps {
        sh '''echo %cd%
cd C:\\Users\\jakub\\Desktop\\CI\\selenium-training-master
set path=path;C:\\Users\\jakub\\Desktop\\CI\\apache-maven-3.6.3\\bin
echo %cd%
mvn test'''
      }
    }

  }
  environment {
    BRANCH = 'master'
  }
}