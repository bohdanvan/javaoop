package com.bvan.javaoop.samples.oop.shape;

/**
 * @author bvanchuhov
 */
public class Circle extends AbstractShape {

    protected double radius;

    public Circle(double radius) {
        this(0.0, 0.0, radius);
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        // Заглушка
        System.out.println("Drawing circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
