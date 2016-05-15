package com.bvan.javaoop.sample.collection.set_map.tree.elems_contract.comparable_contract;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class ComparableTreeElems {

    public static void main(String[] args) {
        testTreeWithComparableElems();
        testTreeWithComparableElemsAndComparator();
    }

    private static void testTreeWithComparableElems() {
        Set<Wrapper> wrapperSet = new TreeSet<>();
        wrapperSet.addAll(createElems());
        System.out.println("Tree with comparable elems: " + wrapperSet);
    }

    private static void testTreeWithComparableElemsAndComparator() {
        Set<Wrapper> wrapperSet = new TreeSet<>(new ReverseWrapperComparator());
        wrapperSet.addAll(createElems());
        System.out.println("Tree with comparable elems and comparator: " + wrapperSet);
    }

    private static List<Wrapper> createElems() {
        return Arrays.asList(
                new Wrapper(25),
                new Wrapper(30),
                new Wrapper(20)
        );
    }
}

class Wrapper implements Comparable<Wrapper> {

    private final int value;

    public Wrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Wrapper other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

class ReverseWrapperComparator implements Comparator<Wrapper> {

    @Override
    public int compare(Wrapper a, Wrapper b) {
        return Integer.compare(b.getValue(), a.getValue());
    }
}
