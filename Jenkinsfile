#!groovy​
node {
//   def mvnHome
//   def response = httpRequest "http://httpbin.org/cookies"
//   echo 'response== ' response.content
   stage 'Setup'
   
   def response = httpRequest 'http://httpbin.org/cookies'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Process'

    def externalMethod = load("loadedFile.groovy")

    // Call the method we defined in externalMethod.
    externalMethod.lookAtThis("Steve")

    // Now load 'externalCall.groovy'.
 //   def externalCall = load("loadedFile.groovy")

    // We can just run it with "externalCall(...)" since it has a call method.
//    externalCall("Steve")
}