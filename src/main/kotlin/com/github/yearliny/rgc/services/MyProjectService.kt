package com.github.yearliny.rgc.services

import com.intellij.openapi.project.Project
import com.github.yearliny.rgc.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
