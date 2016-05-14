package com.bvan.common;

import java.util.List;

/**
 * @author bvanchuhov
 */
public final class ListUtils {

    private ListUtils() {}

    /**
     * Построчно печатает элементы списка в консоль.
     *
     * @param list список.
     * @param <T> generic-тип элементов.
     */
    public static <T> void printList(List<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
    }
}
