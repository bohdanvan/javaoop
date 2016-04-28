package com.bvan.common;

/**
 * @author bvanchuhov
 */
public final class Joiner {

    private Joiner() {
    }

    public static String join(String delimiter, Iterable<?> elems) {
        StringBuilder sb = new StringBuilder();

        for (Object elem : elems) {
            sb.append(elem).append(delimiter);
        }
        sb.delete(sb.length() - 1, sb.length());

        return sb.toString();
    }
}
