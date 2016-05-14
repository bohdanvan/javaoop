package com.bvan.javaoop.samples.oop.shape;

/**
 * @author bvanchuhov
 */
public class Rectangle extends AbstractShape {

    protected double high;
    protected double width;

    public Rectangle(double high, double width) {
        this(0.0, 0.0, high, width);
    }

    public Rectangle(double x, double y, double high, double width) {
        super(x, y);
        this.high = high;
        this.width = width;
    }

    @Override
    public double getArea() {
        return high * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (high + width);
    }

    @Override
    public void draw() {
        // Заглушка
        System.out.println("Drawing rectangle");
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", high=" + high +
                ", width=" + width +
                '}';
    }
}
