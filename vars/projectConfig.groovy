import com.isfp.configurationContext
import groovy.json.JsonSlurper
def call(String projectname){
        def jsonSlurper = new JsonSlurper()
        def config = jsonSlurper.parseText(this.libraryResource("build.json"))
        configurationContext.setProject(config,projectname)
        return configurationContext.project
}