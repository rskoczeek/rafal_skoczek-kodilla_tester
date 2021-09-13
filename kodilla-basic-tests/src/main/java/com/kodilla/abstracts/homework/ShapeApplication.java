package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square = new Square(5.2);
        System.out.println("Square " + square + " surface is " + square.getSurfaceArea());
        System.out.println("Square " + square + " circuit is " + square.getCircuit());


        Triangle triangle = new Triangle(4, 4, 4,4);
        System.out.println("Triangle " + triangle + " circuit is " + triangle.getCircuit());
        System.out.println("Triangle " + triangle + " surface are is " + triangle.getSurfaceArea());

        Trapeze trapeze = new Trapeze(5, 5, 12, 4, 8);
        System.out.println("Trapeze " + trapeze + " circuit is " + trapeze.getCircuit());
        System.out.println("Trapeze " + trapeze + " surface area is " + trapeze.getSurfaceArea());
    }
}
