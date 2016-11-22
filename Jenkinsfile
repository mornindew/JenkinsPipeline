#!groovy​

import groovy.json.JsonSlurper


node {
   stage 'Setup'
   
   def versionsResponse = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
   def deployedVersionResponse = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
    
    stage 'Test Configs'

// Parse the versionsResponse
    def list = new JsonSlurper().parseText(versionsResponse.content)
    def deployedVersions = new JsonSlurper().parseText(deployedVersionResponse.content) 

//Check to confirm that the correct versions are deployed
for (rec in deployedVersions){
	if(!list.contains(rec)){
		println "DOES NOT HAVE THE RIGHT VERSION" +rec
		throw new InterruptedException()
	}
	else{
	    println "Correct Version Found" +rec
	}
}

    stage 'do more stuff'


    stage 'Make deployments great again'
}