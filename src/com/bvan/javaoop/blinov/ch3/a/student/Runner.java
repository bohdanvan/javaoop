package com.bvan.javaoop.blinov.ch3.a.student;

import java.util.GregorianCalendar;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Student student = new Student()
                .setName("John")
                .setSurname("Smith")
                .setAddress("John's Address")
                .setPhoneNumber("+38 (095) 111-11-11")
                .setBirthDate(getTimestamp(20, 1, 1995))
                .setFaculty("FICS")
                .setGroup(3);

        String s = student.toString();
        System.out.println(s);
    }

    private static long getTimestamp(int dayOfMoth, int month, int year) {
        return new GregorianCalendar(year, month - 1, dayOfMoth).getTime().getTime();
    }

}
