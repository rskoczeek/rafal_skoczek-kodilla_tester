package com.kodilla.inheritance.homework;

public class AppOperatingSystem {

    public static void main(String[]args) {

        OperatingSystem windows = new OperatingSystem(2000);
        windows.turnOn();
        windows.turnOff();
        windows.displayReleaseDate();

        OperatingSystem2 linux = new OperatingSystem2(2012);
        linux.turnOn();
        linux.turnOff();
        linux.displayReleaseDate();

        OperatingSystem3 ios = new OperatingSystem3(2021);
        ios.turnOn();
        ios.turnOff();
        ios.displayReleaseDate();
    }
}
