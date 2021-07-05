pipeline {
    agent any
    
    tools{
    	maven "M3"
    }
 
    stages {
        stage('print'){
        	steps{
        		echo 'hello world!'
        	}
        }
        
        stage('build'){
        	steps{
        		sh "mvn clean package"
        	}
        }
    }
}
