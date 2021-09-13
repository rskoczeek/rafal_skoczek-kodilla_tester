package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private final double sideA;
    private final double sideB;
    private final double base;
    private final double height;

    public Triangle(double sideA, double sideB, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getSurfaceArea() {
       return base * height / 2;
    }

    @Override
    public double getCircuit() {
        return sideA + sideB + base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
