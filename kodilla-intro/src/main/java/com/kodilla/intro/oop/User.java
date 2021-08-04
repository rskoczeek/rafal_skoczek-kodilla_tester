package com.kodilla.intro.oop;

public class User {

    private String name;
    private double age;
    private double height;

    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean hasName() {
        return name != null;
    }

    public boolean isOlder(double age) {
        return this.age > age;
    }

    public boolean isHigher(double height) {
        return this.height > height;
    }
}
