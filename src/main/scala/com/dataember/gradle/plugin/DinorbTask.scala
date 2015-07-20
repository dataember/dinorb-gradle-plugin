package com.dataember.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by chaospie on 19/07/15.
 */
class DinorbTask extends DefaultTask {
  @TaskAction
  def test(): Unit = {
    val maybeExt: Option[DinorbPluginExtension] = Option(getProject.getExtensions
      .findByType[DinorbPluginExtension](classOf[DinorbPluginExtension]))
    println("Ok there...")
    maybeExt flatMap (ext => Some(println(ext.message)))
  }
}
