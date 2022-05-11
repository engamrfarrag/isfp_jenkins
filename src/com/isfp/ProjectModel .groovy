package com.isfp
class ProjectModel implements Serializable {
    ProjectModel(){
    }
    String projectName;
    String buildNode;
    String appDirectory;
    String backupPath;
    String patchPath;
    String sourceLocation;
    String[] blockList;
    def replacement ;
 }