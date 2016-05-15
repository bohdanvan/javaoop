package com.bvan.javaoop.sample.oop.shape;

import java.util.List;

/**
 * @author bvanchuhov
 */
public final class ShapeUtils {

    private ShapeUtils() {}

    public static double areasSum(List<Shape> shapes) {
        double areasSum = 0.;

        for (Shape shape : shapes) {
            areasSum += shape.getArea();
        }

        return areasSum;
    }

    public static Shape minPerimeterShape(List<Shape> shapes) {
        if (shapes == null || shapes.isEmpty()) {
            return null;
        }

        Shape minShape = shapes.get(0);

        for (Shape shape : shapes) {
            if (minShape.getPerimeter() > shape.getPerimeter()) {
                minShape = shape;
            }
        }

        return minShape;
    }
}
