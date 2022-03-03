package com.isfp
import groovy.json.JsonSlurper

class ProjectModel implements Serializable {
    String projectName;
    String buildNode;
    String buildDirectory;
    String appDirectory;
    ProjectModel(String name){
        def jsonSlurper = new JsonSlurper()
        def config = jsonSlurper.parse(new File('../resources/config.json'))
        this.projectName=name
        this.buildNode=config[name].buildNode
        this.buildDirectory=config[name].buildDirectory
    }
 }