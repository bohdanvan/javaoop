package com.bvan.javaoop.sample.collection.train;

/**
 * @author bvanchuhov
 */
public class LengthFinder {

    public static void main(String[] args) {
        Train train = new TrainImpl();

        int expectedLength = findLength(train);

        System.out.println(expectedLength);
        System.out.println(train.isLength(expectedLength));
    }

    private static int findLength(Train train) {
        // your code:)
        return 0;
    }
}
