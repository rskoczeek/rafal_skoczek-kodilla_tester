package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square = new Square();
        square.getCircuit();
        square.getSurfaceArea();

        Triangle triangle = new Triangle();
        triangle.getCircuit();
        triangle.getSurfaceArea();

        Trapeze trapeze = new Trapeze();
        trapeze.getCircuit();
        trapeze.getSurfaceArea();
    }
}
