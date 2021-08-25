package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square() {super(5, 5, 5,5, 5);}

    @Override
    public void getSurfaceArea() {
        System.out.println(sideA * sideB);
    }

    @Override
    public void getCircuit() {
        System.out.println(sideA + sideB + sideC + base);
    }
}
