package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseDate;

    public void turnOn () {
        System.out.println("Operating system is starting...");
    }
    public void turnOff () {
        System.out.println("Operating system is shutting down...");
    }
    public OperatingSystem(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void displayReleaseDate () {
        System.out.println("System was released in " + releaseDate);
    }
}
