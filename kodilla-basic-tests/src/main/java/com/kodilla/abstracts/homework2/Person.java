package com.kodilla.abstracts.homework2;

public class Person extends Job {
    String firstName;
    int age;
    String job;

    public Person(int salary, String responsibilities, String firstName, int age, String job) {
        super(salary, responsibilities);
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

        public static void main(String[] args) {

        Plumber plumber = new Plumber(3500, "repairs of sanitary installations");
        System.out.println (plumber.getResponsibilities());
        System.out.println(plumber.getSalary());

        Teacher teacher2 = new Teacher(3000, "teaching in primary school");
        System.out.println(teacher2.getResponsibilities());
        System.out.println(teacher2.getSalary());

        Person teacher = new Person(3000, "teaching in primary school", "Agnieszka", 30, "teacher" );
        System.out.println(teacher.job+ " - " + teacher.getResponsibilities());

        Person plumber2 = new Person(3500, "repairs of sanitary installations", "Marek", 45, "plumber");
        System.out.println(plumber2.job + " - " + plumber2.getResponsibilities());

    }
}
