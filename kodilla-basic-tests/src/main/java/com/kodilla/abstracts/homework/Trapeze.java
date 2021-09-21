package com.kodilla.abstracts.homework;

public class Trapeze extends Shape {

    private final double sideA;
    private final double sideB;
    private final double base;
    private final double height;
    private final double sideC;

    public Trapeze(double sideA, double sideB, double base, double height, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
        this.sideC = sideC;
    }

    @Override
    public double getSurfaceArea() {
        return (sideB + base) * height / 2;
    }

    @Override
    public double getCircuit() {
        return sideA + sideB + sideC +base;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", base=" + base +
                ", height=" + height +
                ", sideC=" + sideC +
                '}';
    }
}
