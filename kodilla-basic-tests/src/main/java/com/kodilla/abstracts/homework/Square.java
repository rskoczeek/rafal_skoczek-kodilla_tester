package com.kodilla.abstracts.homework;

public class Square extends Shape{

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSurfaceArea() {
        return side * side;
    }

    @Override
    public double getCircuit() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
