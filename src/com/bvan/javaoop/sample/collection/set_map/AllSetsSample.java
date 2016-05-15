package com.bvan.javaoop.sample.collection.set_map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class AllSetsSample {

    public static void main(String[] args) {
        List<Integer> elems = Arrays.asList(10, 7, 15, 20, 17);

        Set<Integer> treeSet = new TreeSet<>(elems);
        System.out.println("Tree set: " + treeSet); // В порядке возрастания

        Set<Integer> hashSet = new HashSet<>(elems);
        System.out.println("Hash set: " + hashSet); // В случайном порядке

        Set<Integer> linkedHashSet = new LinkedHashSet<>(elems);
        System.out.println("Linked hash set: " + linkedHashSet); // В порядке добавления
    }
}
