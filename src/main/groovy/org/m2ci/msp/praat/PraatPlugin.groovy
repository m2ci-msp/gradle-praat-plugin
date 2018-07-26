package org.m2ci.msp.praat

import org.gradle.api.*

class PraatPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.pluginManager.apply(PraatWrapperPlugin)

        project.afterEvaluate {
            def praatTask = project.tasks.getByName('praat')
            project.tasks.withType(PraatExec).each {
                it.dependsOn praatTask
            }
        }
    }
}
