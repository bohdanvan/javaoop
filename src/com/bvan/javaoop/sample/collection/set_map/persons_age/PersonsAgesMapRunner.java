package com.bvan.javaoop.sample.collection.set_map.persons_age;

import com.bvan.javaoop.sample.common.Person;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class PersonsAgesMapRunner {

    public static void main(String[] args) {
        List<Person> persons = createPersons();
        PersonsAge personsAge = new PersonsAge(persons);

        System.out.println("People with age=25: " + personsAge.getByAge(25));
        System.out.println("People with age=30: " + personsAge.getByAge(30));
        System.out.println("People with age=100: " + personsAge.getByAge(100));

        System.out.println("People with age in [25, 30]: " + personsAge.getByAges(25, 30));
        System.out.println();
    }

    public static List<Person> createPersons() {
        return Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20),
                new Person("Lisa", 30)
        );
    }
}

