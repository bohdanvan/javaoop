package com.bvan.javaoop.sample.enum_example.gender.bad;

import static com.bvan.javaoop.sample.enum_example.gender.bad.BadUser.MALE;

/**
 * @author bvanchuhov
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser john = new BadUser("John", 25, MALE);
        System.out.println(john);
    }
}
