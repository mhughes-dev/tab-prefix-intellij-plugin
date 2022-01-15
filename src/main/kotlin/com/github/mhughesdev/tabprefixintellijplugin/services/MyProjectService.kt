package com.github.mhughesdev.tabprefixintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.mhughesdev.tabprefixintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
