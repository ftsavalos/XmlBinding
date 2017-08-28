package com.example.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;
import java.time.Instant;

public class Performance {

    private final static Logger LOGGER = LoggerFactory.getLogger(Performance.class);

    public static void printTime(Runnable runnable) {
        Instant now = Instant.now();
        runnable.run();
        LOGGER.info("Operation took {} milliseconds", Duration.between(now, Instant.now()).toMillis());
    }
}
