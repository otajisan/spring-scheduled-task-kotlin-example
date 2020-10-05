package com.example

import org.springframework.core.task.TaskExecutor

class TaskExecutorExample(private val taskExecutor: TaskExecutor) {
  fun runTask() {
    taskExecutor.execute(RunnableOnce())
  }
}