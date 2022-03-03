package com.isfp.config
import groovy.json.JsonSlurper
public class Project {
    String projectName;
    String buildNode;
    String buildDirectory;
    String appDirectory;
    public Project(String name){
        def jsonSlurper = new JsonSlurper()
        def config = jsonSlurper.parse(new File('../resources/config.json'))
        this.projectName=name
        this.buildNode=config[name].buildNode
        this.buildDirectory=config[name].buildDirectory
}
