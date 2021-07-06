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
          
        stage('Send Buld jar'){
        	steps{   
				sh "scp -P 1235 /var/lib/jenkins/workspace/smartstore_isaac2/target/smart-store-0.0.1-SNAPSHOT.jar root@106.10.45.18:/smart-store/app/smart-store.jar"
        	} 
		}
    }
}
