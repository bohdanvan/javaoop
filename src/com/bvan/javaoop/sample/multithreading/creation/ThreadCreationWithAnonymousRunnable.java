package com.bvan.javaoop.sample.multithreading.creation;

import com.bvan.javaoop.sample.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithAnonymousRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("Hello");
            }
        });
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}
