#!groovy​

import groovy.json.JsonSlurper
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.JSON


node {
   stage 'Setup'
   
   def response = httpRequest 'http://configsvc.dev-charter.net:8080/configmiddle/versions'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Test Configs'

// Parse the response
//    def list = new JsonSlurper().parseText(response.content)

// Print them out to make sure
//    list.each { "JSON Line:  " println it }


//    def externalMethod  =  load "${workspace}@script/loadedFile.groovy"
//    def configValue = externalMethod.processJson(response.content)

    def http = new HTTPBuilder( 'http://ajax.googleapis.com' )
	http.request( GET, JSON ) {
  	uri.path = '/ajax/services/search/web'
  	uri.query = [ v:'1.0', q: 'Calvin and Hobbes' ]

  	response.success = { resp, json ->
    assert json.size() == 3
    println "Query response: "
    json.responseData.results.each {
      println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
    }
  }
}


}