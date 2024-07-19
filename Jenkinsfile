pipeline {
    agent any

    stages {
        stage('Unit test') {
            steps {
                echo 'Using TestNG'
            }
        }
        stage('Static Analysis') {
            steps {
                echo 'Using Sonar qube'
            }
        }
        
        stage('Generate Build') {
            steps {
                echo 'Using Maven'
    }
}
       stage('Execute Regression Tests') {
            steps {
                echo 'Using Selenium'
}
}
}
}
