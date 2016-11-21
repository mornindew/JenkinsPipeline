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
}