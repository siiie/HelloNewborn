package com.siiie;


import java.util.logging.Logger;

public class LogClass {
    public static Logger logger = Logger.getLogger("myApp");


    public static void ShowLog(String className, String methodName, String message){
        logger.info(className+ " Class - " + methodName + " Method - " + " with message: " + message);
    }
}
