package com.bvan.javaoop.samples.oop.shape;

/**
 * @author bvanchuhov
 */
public abstract class AbstractShape implements Shape {

    protected double x;
    protected double y;

    public AbstractShape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
