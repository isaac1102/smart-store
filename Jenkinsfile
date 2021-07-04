pipeline {
    agent any

    tools {
        maven "Maven 3.6.3"
    }

    options {
        skipDefaultCheckout()
    }

    stages {
        stage('git checkout & clone') {
            steps {
				sh 'java -version'
            }
        }
    }

}
