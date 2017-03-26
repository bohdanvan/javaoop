package com.bvan.javaoop.sample.collection.set_map.persons_age_map;

import com.bvan.javaoop.sample.common.Person;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class PersonsAgeMap {

    private final SortedMap<Integer, List<Person>> ageToPersonsMap = new TreeMap<>();

    public PersonsAgeMap() {
    }

    public PersonsAgeMap(Iterable<Person> persons) {
        addPersons(persons);
    }

    public void addPerson(Person person) {
        int age = person.getAge();
        List<Person> personsWithAge = ageToPersonsMap.get(age);

        if (personsWithAge == null) {
            personsWithAge = new LinkedList<>();
            ageToPersonsMap.put(age, personsWithAge);
        }

        personsWithAge.add(person);
    }

    public void addPersons(Iterable<Person> persons) {
        for (Person person : persons) {
            addPerson(person);
        }
    }

    public List<Person> getByAge(int age) {
        List<Person> personsWithAge = ageToPersonsMap.get(age);
        return (personsWithAge != null) ? new ArrayList<>(personsWithAge) : Collections.emptyList();
    }

    public List<Person> getByAges(int minAge, int maxAge) {
        List<Person> res = new ArrayList<>();
        for (List<Person> people : ageToPersonsMap.subMap(minAge, maxAge + 1).values()) {
            res.addAll(people);
        }
        return res;
    }
}
