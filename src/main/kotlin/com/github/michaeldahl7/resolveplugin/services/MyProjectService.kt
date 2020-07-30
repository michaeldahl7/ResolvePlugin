package com.github.michaeldahl7.resolveplugin.services

import com.intellij.openapi.project.Project
import com.github.michaeldahl7.resolveplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
