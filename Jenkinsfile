#!groovy​

import groovy.json.JsonSlurper


node {
   stage 'Setup'
   
   def response = httpRequest 'http://httpbin.org/cookies'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Test Configs'


}