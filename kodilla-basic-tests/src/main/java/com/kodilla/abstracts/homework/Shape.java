package com.kodilla.abstracts.homework;

public abstract class Shape {

    public int sideA;
    public int sideB;
    public int sideC;
    public int height;
    public int base;

    public Shape (int sideA, int sideB, int sideC, int height, int base) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = base;
        this.height = height;
    }

    public abstract void getSurfaceArea();
    public abstract void getCircuit();
}
