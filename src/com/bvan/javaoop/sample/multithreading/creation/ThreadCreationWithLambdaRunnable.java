package com.bvan.javaoop.sample.multithreading.creation;

import com.bvan.javaoop.sample.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithLambdaRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> ThreadUtils.println("Hello"));
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}
