package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableAsync
class ScheduledTaskApplication {
  fun doTask() {
    val task = ScheduledTask()
    task.test()
  }
}

fun main(args: Array<String>) {
  val ctx = runApplication<ScheduledTaskApplication>(*args)
  ctx.getBean(ScheduledTaskApplication::class.java).doTask()
}

