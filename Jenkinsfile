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
        
        stage('Send Buld jar'){
        	steps{
        		sh 'ls -al'
        		sh 'pwd'
        		sh 'dir ./target'
        		sh 'pwd'
				
        	} 
		}
    }
}
