#!groovy​
node {
   stage 'Setup'
   
   def response = httpRequest 'http://httpbin.org/cookies'
        println("Status: "+response.status)
        println("Content: "+response.content)
    
    stage 'Process'

    def externalMethod = load("loadedFile.groovy")

// Call the method we defined in externalMethod.
    externalMethod.lookAtThis("Steve")
}