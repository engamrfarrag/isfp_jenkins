package com.isfp
import groovy.json.JsonSlurper
public class ProjectModel {
    String projectName;
    String buildNode;
    String buildDirectory;
    String appDirectory;
    public ProjectModel(String name){
        def jsonSlurper = new JsonSlurper()
        def config = jsonSlurper.parse(new File('../resources/config.json'))
        this.projectName=name
        this.buildNode=config[name].buildNode
        this.buildDirectory=config[name].buildDirectory
}
