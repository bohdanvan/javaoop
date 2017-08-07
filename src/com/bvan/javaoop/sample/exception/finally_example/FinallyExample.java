package com.bvan.javaoop.sample.exception.finally_example;

/**
 * @author bvanchuhov
 */
public class FinallyExample {

    public static void main(String[] args) {
        m1();
        m2();
        System.out.println(f3());
    }

    private static void m1() {
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("In Catch");
        } finally {
            System.out.println("In Finally");
        }
    }

    private static void m2() {
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("In Catch");
            throw new RuntimeException(e);
        } finally {
            System.out.println("In Finally");
        }
    }

    private static int f3() {
        try {
            return 1;
        } finally {
            return 2; // BAD STYLE
        }
    }
}
