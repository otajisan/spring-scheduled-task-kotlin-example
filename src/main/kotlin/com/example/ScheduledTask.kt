package com.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.TaskScheduler
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler
import org.springframework.stereotype.Component
import java.lang.Thread.sleep
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService

@Component
class ScheduledTask {

  private val logger: Logger = LoggerFactory.getLogger(ScheduledTask::class.java)

  /*
  @Scheduled(fixedRate = 5000)
  fun doTaskEvery5Seconds() {
    logger.info("doTaskEvery5Seconds by fixedRate")
  }

  @Scheduled(cron = "* * * * * *")
  fun doTaskEverySecond() {
    logger.info("doTaskEverySecond by crontab")
  }
   */

  @Async
  fun test() {
    val runnableOnce = RunnableOnce()
    val scheduler = ConcurrentTaskScheduler(Executors.newSingleThreadScheduledExecutor())
    val scheduledFuture = scheduler.schedule(runnableOnce, Date(1432152000000L))
    if (scheduledFuture.isDone) {
      logger.info("done!!!")
    }
    //scheduledFuture.cancel(true)
  }
}