package com.bvan.javaoop.blinov.ch3.b.line;

import com.bvan.common.Args;
import com.bvan.common.DoubleUtils;

import java.text.MessageFormat;
import java.util.Objects;

/**
 * Immutable line.
 * y = k * x + b
 * @author bvanchuhov
 */
public final class Line {

    private final double k;
    private final double b;

    public Line(Point start, Point end) {
        this.k = (end.getY() - start.getY()) / (end.getX() - start.getX());
        this.b = start.getY() - start.getX() * (end.getY() - start.getY()) / (end.getX() - start.getX());
    }

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point getIntersectionWithAxis(Axis axis) {
        Args.notNull(axis, "axis");

        switch (axis) {
            case X_AXIS:
                return new Point(-b / k, 0.);
            case Y_AXIS:
                return new Point(0., b);
            default:
                throw new AssertionError("Axis not supported: " + axis);
        }
    }

    public Point getIntersection(Line other) {
        // TODO
        return null;
    }

    public boolean isParallel(Line other) {
        return DoubleUtils.doubleEquals(this.k, other.k, 1.e-5);
    }

    //----- Getters -----

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return Double.compare(line.k, k) == 0 &&
                Double.compare(line.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, b);
    }

    @Override
    public String toString() {
        return MessageFormat.format("y = {0} * x + {1}", k, b);
    }
}
