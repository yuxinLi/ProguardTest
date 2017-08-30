package com.example.proguardtest;

public class Utils {

    public int util = 1;

    public void methodNormal() {
        String logMessage = "this is normal method";
        logMessage = logMessage.toLowerCase();
        System.out.println(logMessage);
    }

    public void methodUnused() {
        String logMessage = "this is unused method";
        logMessage = logMessage.toLowerCase();
        System.out.println(logMessage);
    }

}