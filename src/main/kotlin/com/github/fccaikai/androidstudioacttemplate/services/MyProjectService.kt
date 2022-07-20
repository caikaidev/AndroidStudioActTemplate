package com.github.fccaikai.androidstudioacttemplate.services

import com.intellij.openapi.project.Project
import com.github.fccaikai.androidstudioacttemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
