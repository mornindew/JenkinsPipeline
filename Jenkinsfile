#!groovy​

import groovy.json.JsonSlurper


node {
   stage 'Setup'
   
   def response = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
    
    stage 'Test Configs'

// Parse the response
    def list = new JsonSlurper().parseText(response.content)

// Print them out to make sure
//   list.each { "JSON Line:  " println it }

 def z = 0
while (z < list.size) {
    println list[z]
    z++
}   

}