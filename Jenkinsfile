pipeline {
    agent any

    options {
        skipDefaultCheckout()
    }

    stages {
        stage('git checkout & clone') {
            steps {
				sh 'java -version'
            }
        }
        
        stage('print'){
        	steps{
        		sh 'echo hello world!'
        	}
        }
    }
}
