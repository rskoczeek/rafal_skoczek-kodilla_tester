package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux (int releaseDate) {
        super(releaseDate);
    }
        @Override
        public void turnOn() {
            System.out.println("Linux system is starting...");
        }
        @Override
        public void turnOff() {
        System.out.println("Linux system is shutting down...");
    }
}
