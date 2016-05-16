package com.bvan.common;

/**
 * @author bvanchuhov
 */
public final class Validator {

    private Validator() {
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
