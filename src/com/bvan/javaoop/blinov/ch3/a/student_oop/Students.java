package com.bvan.javaoop.blinov.ch3.a.student_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class Students {

    private final List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public Students findByFaculty(String faculty) {
        Students results = new Students();
        for (Student student : students) {
            if (Objects.equals(student.getFaculty(), faculty)) {
                results.add(student);
            }
        }

        return results;
    }

    public Students findByCourse(int course) {
        Students results = new Students();
        for (Student student : students) {
            if (student.getCourse() == course) {
                results.add(student);
            }
        }

        return results;
    }

    public Students findByBirthDate(long minBirthDate) {
        Students results = new Students();
        for (Student student : students) {
            if (student.getBirthDate() >= minBirthDate) {
                results.add(student);
            }
        }

        return results;
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
