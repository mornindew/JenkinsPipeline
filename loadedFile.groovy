#!groovy​

import groovy.json.JsonSlurper

// Methods in this file will end up as object methods on the object that load returns.
def checkConfigs(def deployedConfig, def expectedConfig) {
    
 //   echo "Look at this, ${deployedConfig}! You loaded this from another file!"
    return false;
}

def processJson(String json) {
    def jsonSlurper = new JsonSlurper()
    def jsonObject = jsonSlurper(json)
    jsonSlurper = null
    for(int i = 0; i < jsonObject.size(); i++) {
        switch(jsonObject[i].name) {
            case "Source":
                println("Source: "+jsonObject[i].name)
                break
            case "Version":
                println("Version: "+jsonObject[i].name)
                break
        }
    }
}

return this;