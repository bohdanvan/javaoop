package com.bvan.javaoop.sample.collection.set_map.tree;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Bohdan Vanchuhov
 */
public class SortedSetSample {

    public static void main(String[] args) {
        List<Integer> elems = Arrays.asList(10, 7, 15, 20, 17);
        SortedSet<Integer> sortedSet = new TreeSet<>(elems);
        System.out.println(sortedSet);

        SortedSet<Integer> subSet = sortedSet.subSet(8, 18);
        System.out.println("[8..18]:\t" + subSet);

        System.out.println("[head..12]:\t" + sortedSet.headSet(12));
        System.out.println("[12..tail]:\t" + sortedSet.tailSet(12));
    }
}
