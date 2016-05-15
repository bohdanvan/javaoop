package com.bvan.javaoop.sample.collection.set_map.tree.elems_contract.without_contract;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author bvanchuhov
 */
public class TreeElemsWithoutContract {

    public static void main(String[] args) {
        Set<Wrapper> wrapperSet = new TreeSet<>();

        wrapperSet.add(new Wrapper(10)); // бросается ClassCastException
        System.out.println(wrapperSet);
    }
}

class Wrapper {

    private final int value;

    public Wrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
