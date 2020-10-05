package com.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.Thread.sleep

class RunnableOnce : Runnable {
  private val logger: Logger = LoggerFactory.getLogger(RunnableOnce::class.java)

  override fun run() {
    logger.info("RunnableOnce called.")
    sleep(5)
  }
}