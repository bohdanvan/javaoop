package com.bvan.javaoop.sample.exception.unchecked;

/**
 * @author bvanchuhov
 */
public class ErrorSample {

    public static void main(String[] args) {
        int[] array = null;

        try {
            array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Error");
        }

        System.out.println(array);
    }
}
