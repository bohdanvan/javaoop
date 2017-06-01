package com.bvan.javaoop.sample.multithreading.creation;

/**
 * @author bvanchuhov
 */
public class EmptyThreadCreation {

    public static void main(String[] args) {
        Thread thread = new Thread(); // why does constructor allow this?
        thread.start();
    }
}
