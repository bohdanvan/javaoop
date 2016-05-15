package com.bvan.javaoop.sample.collection.set_map.hashtable.elems_contract.with_contract;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class HashTableElemsWithContract {

    public static void main(String[] args) {
        Set<Wrapper> wrapperSet = new HashSet<>();

        wrapperSet.add(new Wrapper(10));
        wrapperSet.add(new Wrapper(10));

        System.out.println(wrapperSet);
    }
}

class Wrapper {

    private final int value;

    public Wrapper(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrapper wrapper = (Wrapper) o;
        return value == wrapper.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
