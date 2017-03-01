package com.bvan.javaoop.sample.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadUtils {

    private ThreadUtils() {}

    public static void println(Object msg) {
        System.out.println(Thread.currentThread() + ": " + msg);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
