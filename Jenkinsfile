pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https:/github.com/pawel3ak/selenium-training.git', branch: 'master')
      }
    }

    stage('Maven build') {
      steps {
        sh '''echo %cd%
cd C:\\Users\\marci\\Test\\projektDoCI\\selenium-training
echo %cd%
set M2_Home=D:\\Tester\\IntelliJ IDEA Community Edition 2020.2\\plugins\\maven\\lib\\maven3
set PATH=%PATH%;"D:\\Tester\\IntelliJ IDEA Community Edition 2020.2\\plugins\\maven\\lib\\maven3\\bin"
mvn test'''
      }
    }

  }
}