package com.selenium.rahulcourse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
    private static Logger logs=LogManager.getLogger(Log4jDemo.class.getName());
    public static void main(String[] args) {
        logs.debug("I am debugging");
        logs.info("Onject is present");
        logs.error("not present");
        logs.fatal("There is a fatal");

    }
}
