package com.bvan.javaoop.blinov.ch3.a.student;


import com.bvan.common.Args;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public final class StudentUtils {

    private StudentUtils() {
    }

    public static List<Student> findByFaculty(List<Student> students, String faculty) {
        Args.notNull(students, "students");

        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (Objects.equals(student.getFaculty(), faculty)) {
                results.add(student);
            }
        }

        return results;
    }

    public static List<Student> findByCourse(List<Student> students, int cource) {
        Args.notNull(students, "students");

        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse() == cource) {
                results.add(student);
            }
        }

        return results;
    }

    public static List<Student> findByBirthDate(List<Student> students, long minBirthDate) {
        Args.notNull(students, "students");

        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirthDate() >= minBirthDate) {
                results.add(student);
            }
        }

        return results;
    }
}
