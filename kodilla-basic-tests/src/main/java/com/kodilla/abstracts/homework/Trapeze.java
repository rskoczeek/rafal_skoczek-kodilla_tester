package com.kodilla.abstracts.homework;

public class Trapeze extends Shape {

    public Trapeze() {super(5, 8, 5, 4, 12);}
    @Override
    public void getSurfaceArea() {
        System.out.println("Surface area of the trapeze is " + (((sideB + base) * height) / 2));
    }

    @Override
    public void getCircuit() {
        System.out.println("Circuit of the trapeze is " + (sideA + sideB + sideC +base));
    }
}
