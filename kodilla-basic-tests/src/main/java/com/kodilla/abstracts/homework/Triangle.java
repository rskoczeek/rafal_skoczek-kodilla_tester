package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {super (3, 5, 0, 4, 6);}

    @Override
    public void getSurfaceArea() {
        System.out.println("Surface area of the triangle is " + (base * height) / 2);
    }

    @Override
    public void getCircuit() {
        System.out.println("Circuit of the triangle is " + (sideA + sideB + base));
    }
}
