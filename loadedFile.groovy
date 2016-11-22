
// Methods in this file will end up as object methods on the object that load returns.
def checkConfigs(def deployedConfig, def expectedConfig) {
    
    echo "Look at this, ${deployedConfig}! You loaded this from another file!"
    return false;
}

return this;