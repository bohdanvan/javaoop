package com.bvan.javaoop.sample.multithreading.creation;

import com.bvan.javaoop.sample.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithInheritance {

    public static void main(String[] args) {
        Thread thread = new TaskThread();
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

class TaskThread extends Thread {
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}
