package com.kodilla.inheritance.homework;

public class OperatingSystem2 extends OperatingSystem {

    public OperatingSystem2 (int releaseDate) {
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
