package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4,5);
        car.turnOnLights();
        car.openDoors();
        System.out.println(car.getSeats());
        System.out.println(car.getWheels());
        car.displayNumberOfSeats();

        Convertible convertible = new Convertible(4,2);
        convertible.openRoof();
        System.out.println(convertible.getSeats());        // gettery
        System.out.println(convertible.getWheels());
        convertible.displayNumberOfSeats();                // publiczna metoda


    }
}
