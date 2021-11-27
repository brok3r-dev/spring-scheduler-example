package com.jay.scheduler

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat
import java.util.*

@Component
class ScheduledTask {
    val logger: Logger = LoggerFactory.getLogger(this.javaClass)
    val dateFormat: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    @Scheduled(fixedRate = 5000)
    fun reportCurrentTime() {
        logger.info("The time is now ${dateFormat.format(Date())}")
    }
}

