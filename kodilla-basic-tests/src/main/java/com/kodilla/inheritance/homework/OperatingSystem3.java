package com.kodilla.inheritance.homework;

public class OperatingSystem3 extends OperatingSystem {

    public OperatingSystem3 (int releaseDate) {
        super(releaseDate);
    }
    @Override
    public void turnOn() {
        System.out.println("Welcome");
    }
    @Override
    public void turnOff() {
        System.out.println("Goodbye");
    }
}
