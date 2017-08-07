package com.bvan.javaoop.sample.exception.inheritance;

/**
 * @author Bohdan Vanchuhov
 */
public class InheritanceSample {

    public static void main(String[] args) {
        useA(new B());
    }

    private static void useA(A a) {
        try {
            a.methodA();
        } catch (AException e) {
            e.printStackTrace();
        }
    }
}

class A {
    public void methodA() throws AException {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void methodA() {
        throw new IllegalArgumentException();
    }
}

class AException extends Exception {}

class BException extends AException {}
