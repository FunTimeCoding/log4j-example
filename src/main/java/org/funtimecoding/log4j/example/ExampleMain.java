package org.funtimecoding.log4j.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author shiin
 */
public class ExampleMain {

    private static final Logger logger = LogManager.getLogger(ExampleMain.class);

    public static void main(String[] args) {

        logger.error("Hello World");
    }
}
