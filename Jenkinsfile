pipeline {
    agent any
    
    tools{
    	maven "M3"
        jdk "java 1.8"
    }
 
    stages {
    	stage ('Initialize') {
            steps {
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
            }
        }
        
        stage('print'){
        	steps{
        		echo 'hello world!'
        	}
        }
        
        stage('Build'){
        	steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install clean package' 
            }
        }
        
        stage('Send Buld jar'){
        	steps{
        		sh "cd target"
        		sh "pwd"
				sh "scp -P 1235 ./smart-store-0.0.1-SNAPSHOT.jar root@106.10.45.18:/smart-store/app/smart-store.jar"
        	} 
		}
    }
}
