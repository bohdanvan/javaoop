package com.bvan.javaoop.courseproject.comparing;

import com.bvan.javaoop.courseproject.entity.Person;

import java.util.Comparator;

/**
 * Компараторы Person для упорядочивания по полям.
 *
 * @author bvanchuhov
 */
public enum PersonComparator implements Comparator<Person> {
    ID {
        @Override
        public int compare(Person a, Person b) {
            return Integer.compare(a.getId(), b.getId());
        }
    },
    NAME {
        @Override
        public int compare(Person a, Person b) {
            return a.getName().compareTo(b.getName());
        }
    },
    AGE {
        @Override
        public int compare(Person a, Person b) {
            return Integer.compare(a.getAge(), b.getAge());
        }
    }
}
