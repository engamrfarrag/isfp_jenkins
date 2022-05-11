package com.isfp
import groovy.json.JsonSlurper

class ProjectModel implements Serializable {
    String projectName;
    String buildNode;
    String appDirectory;
    String backupPath;
    String patchPath;
    String sourceLocation;
    String[] blockList;
    def replacement ;

    ProjectModel(String name){
        def jsonSlurper = new JsonSlurper()
        def config = jsonSlurper.parse(new File('../resources/bulid.json'))
        def project = config[name]
        this.projectName=name
        this.buildNode=project.buildNode
        this.sourceLocation=project.sourceLocation
        this.replacement=project.replacement
        this.appDirectory=project.appDirectory
        this.patchPath=project.patchPath
        this.patchPath=project.backupPath
    }
 }