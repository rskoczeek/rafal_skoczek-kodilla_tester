package com.kodilla.inheritance.homework;

public class AppOperatingSystem {

    public static void main(String[]args) {

        OperatingSystem windows = new OperatingSystem(2000);
        windows.turnOn();
        windows.turnOff();
        windows.displayReleaseDate();

        Linux linux = new Linux(2012);
        linux.turnOn();
        linux.turnOff();
        linux.displayReleaseDate();

        Ios ios = new Ios(2021);
        ios.turnOn();
        ios.turnOff();
        ios.displayReleaseDate();
    }
}
