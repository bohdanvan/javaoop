package com.bvan.javaoop.sample.oop.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(10, 20));
        shapes.add(new Circle(10));

        System.out.println("Shapes: " + shapes);
        System.out.println("Areas sum: " + ShapeUtils.areasSum(shapes));
        System.out.println("Shape with minimum perimeter: " + ShapeUtils.minPerimeterShape(shapes));
    }
}
