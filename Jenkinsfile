#!groovy​

import groovy.json.JsonSlurper


node {
   stage 'Setup'
   
	   //get the list of config versions from config middle
	   def versionsResponse = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
	   
	   //get the currently deployed version for a service.  This will be an argument passed in
	   def deployedVersionResponse = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
    
   stage 'Test Configs'

		// Parse the versionsResponse into a list
	    def list = new JsonSlurper().parseText(versionsResponse.content)
	    // Parse the deployed versions into a list
	    def deployedVersions = new JsonSlurper().parseText(deployedVersionResponse.content) 

		//Check to confirm that the correct versions are deployed
		for (rec in deployedVersions){
			//check to see that deployed version actually exists in config middle
			if(!list.contains(rec)){
				println "DOES NOT HAVE THE RIGHT VERSION" +rec
				//Terminate the build if it is the incorrect version
				//TODO:  must be a better way to terminate, ideally the pipeline would set the correct verison
				throw new InterruptedException()
			}
			else{
			    println "Correct Version Found" +rec
			}
		}

    stage 'do more stuff'

    

    stage 'Make deployments great again'
}