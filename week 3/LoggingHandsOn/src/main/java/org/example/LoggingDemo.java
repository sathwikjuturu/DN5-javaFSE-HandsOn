package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.trace("This is TRACE message");
        logger.debug("This is DEBUG message");
        logger.info("This is INFO message");
        logger.warn("This is WARN message");
        logger.error("This is ERROR message");

    }
}