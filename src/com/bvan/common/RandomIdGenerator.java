package com.bvan.common;

import java.util.Random;

/**
 * Генератор псевдослучайних id.
 *
 * @author bvanchuhov
 */
public final class RandomIdGenerator {

    private static Random random = new Random();

    private RandomIdGenerator() {}

    /**
     * Генерирует псевдослучайный id типа int.
     *
     * @return псевдослучайный id.
     */
    public static int generateInt() {
        return random.nextInt();
    }
}
