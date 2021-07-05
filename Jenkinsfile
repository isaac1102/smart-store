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
 
		    
    	stage('Build') {
            steps {
                sh "mvn -DskipTests clean package"
                archiveArtifacts 'smartstore/target/*.jar'
            }

            post {
                 success {
                      sh ("curl -X POST -H \"Content-Type: application/json\" \
                      --data '{\"state\": \"success\", \"context\": \"@@pass ci test & build\", \"target_url\": \"http://115.85.180.192:8080/job/make-delivery\"}' \
                      \"https://${GITHUB_TOKEN}@api.github.com/repos/isaac/smart-store/statuses/${GIT_COMMIT_SHA}\"")
                    }

                    failure {
                      sh ("curl -X POST -H \"Content-Type: application/json\" \
                      --data '{\"state\": \"failure\", \"context\": \"@@failure ci test & build\", \"target_url\": \"http://115.85.180.192:8080/job/make-delivery\"}' \
                      \"https://${GITHUB_TOKEN}@api.github.com/repos/isaac/smart-store/statuses/${GIT_COMMIT_SHA}\"")
                    }
            }
        }
    }
}
