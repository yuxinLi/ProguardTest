package com.example.proguardtest;

public class NativeUtils {

//    public static native void methodNative();

    public static void methodNotNative() {
        String logMessage = "this is not native method";
        logMessage = logMessage.toLowerCase();
        System.out.println(logMessage);
    }

}