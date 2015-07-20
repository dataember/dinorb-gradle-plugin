package com.dataember.gradle.plugin

import org.gradle.api.{Project, Plugin}

/**
 * Created by chaospie on 19/07/15.
 */
class DinorbPlugin extends Plugin[Project] {

  def apply(project: Project): Unit = {
    project.getExtensions().create("dinorbSetting", classOf[DinorbPluginExtension])
    project.getTasks().create("demo", classOf[DinorbTask])
  }
}
