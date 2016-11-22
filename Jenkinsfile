#!groovy​

import groovy.json.JsonSlurper


node {
   stage 'Setup'
   
   def response = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Test Configs'

// Parse the response
    def list = new JsonSlurper().parseText(response.content)

// Print them out to make sure
    list.each { "JSON Line:  " println it }


    def externalMethod  =  load "${workspace}@script/loadedFile.groovy"
    def configValue = externalMethod.processJson(response.content)


}