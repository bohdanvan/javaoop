package com.bvan.javaoop.courseproject.comparing;

import com.bvan.javaoop.courseproject.entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.bvan.common.ListUtils.printList;

/**
 * Пример сортировки списка Person по одному критерию.
 *
 * @author bvanchuhov
 */
public class SortingRunner {

    public static void main(String[] args) {
        List<Person> initPersons = createPersons();

        testSortByAgeAsc(initPersons);
        testSortByNameDesc(initPersons);
    }

    private static void testSortByAgeAsc(List<Person> initPersons) {
        List<Person> persons = new ArrayList<>(initPersons);

        Collections.sort(persons, PersonComparator.AGE);
        printList("Sorted person list (AGE, ACS):", persons);
    }

    private static void testSortByNameDesc(List<Person> initPersons) {
        List<Person> persons = new ArrayList<>(initPersons);

        Collections.sort(persons, Collections.reverseOrder(PersonComparator.NAME));
        printList("Sorted person list (NAME, DESC):", persons);
    }

    private static List<Person> createPersons() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", 30));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("John", 15));
        persons.add(new Person("Alan", 20));
        persons.add(new Person("John", 15));

        return persons;
    }
}
