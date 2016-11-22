#!groovy​

import groovy.json.JsonSlurper


node {
   stage 'Setup'
   
   def response = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Test Configs'

    def jsonSlurper = new JsonSlurper().parseText(response.content)
    

}