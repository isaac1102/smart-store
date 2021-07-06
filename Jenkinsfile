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
        		sh 'll'
        		sh 'pwd'
        		sh 'cd target'
        		sh 'pwd'
				
        	} 
		}
    }
}
