package com.bvan.javaoop.blinov.ch3.b.line;

/**
 * @author bvanchuhov
 */
public class LineRunner {

    public static void main(String[] args) {
        Line a = new Line(new Point(1., 1.), new Point(10., 10.));
        Line b = new Line(new Point(4., 0.), new Point(0., 4.));

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println(b.getIntersectionWithAxis(Axis.X_AXIS));
        System.out.println(b.getIntersectionWithAxis(Axis.Y_AXIS));

        System.out.println(a.isParallel(b));
    }
}
