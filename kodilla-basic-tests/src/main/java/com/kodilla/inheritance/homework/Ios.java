package com.kodilla.inheritance.homework;

public class Ios extends OperatingSystem {

    public Ios(int releaseDate) {
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
