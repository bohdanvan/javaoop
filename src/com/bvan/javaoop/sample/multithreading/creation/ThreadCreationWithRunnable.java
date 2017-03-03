package com.bvan.javaoop.sample.multithreading.creation;

import com.bvan.javaoop.sample.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}
