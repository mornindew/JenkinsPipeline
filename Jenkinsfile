#!groovy​

import groovy.json.JsonSlurper


node {
   stage 'Setup'
   
   def response = httpRequest 'http://httpbin.org/cookies'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Process'

    def jsonSlurper = new JsonSlurper()
    def json = jsonSlurper.parseText('{ "name": "John Doe" }')

 //   def json = new JsonSlurper().parseText(jsonAsText)

	def name= json.name
	name.each{
    	println it."name"
	}

//   def externalMethod  =  load "${workspace}@script/loadedFile.groovy"

// Call the method we defined in externalMethod.
    def configValue = externalMethod.checkConfigs(object, object)
    println("configValue: "+configValue)
}