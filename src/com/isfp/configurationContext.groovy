package com.isfp
class configurationContext {
   static ProjectModel project  =new ProjectModel() 
   static setProject(config,name){
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