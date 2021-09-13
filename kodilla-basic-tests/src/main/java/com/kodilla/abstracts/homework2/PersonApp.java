package com.kodilla.abstracts.homework2;

public class PersonApp {

    public static void main(String[] args) {
        Person aga = new Person("Aga", 32, new Teacher());
        Person karol = new Person("Karol", 44, new Plumber());

        System.out.println(aga.getResponsibilities());
        System.out.println(karol.getResponsibilities());
    }
}
