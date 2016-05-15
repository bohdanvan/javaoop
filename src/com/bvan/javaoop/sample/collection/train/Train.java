package com.bvan.javaoop.sample.collection.train;

/**
 * @author bvanchuhov
 */
public interface Train {

    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
