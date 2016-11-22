#!groovy​
node {
   stage 'Setup'
   
   def response = httpRequest 'http://httpbin.org/cookies'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Process'

   def externalMethod  =  load "${workspace}@script/loadedFile.groovy"

// Call the method we defined in externalMethod.
    def configValue = externalMethod.checkConfigs("Steve")
    println("configValue: "+configValue)
}