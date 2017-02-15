package com.bvan.javaoop.sample.collection.sorting;

import com.bvan.javaoop.sample.common.Person;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class PersonSorting {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Fill", 20)
        );

        Collections.sort(people, new AgeComparator());
        System.out.println("Age criterion, ascending order: " + people);

        Collections.sort(people, Collections.reverseOrder(new AgeComparator()));
        System.out.println("Age criterion, descending order: " + people);
    }

}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
