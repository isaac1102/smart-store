pipeline {
    agent any
    
    tools{
    	maven "M3"
    }
 
    stages {
        stage('build'){
        	steps{
        		echo 'hello world!'
        	}
        }
    }
    
    stages {
        stage('build'){
        	steps{
        		sh 'mvn clean package'
        	}
        }
    }
    
}
