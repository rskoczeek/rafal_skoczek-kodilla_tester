package com.kodilla.abstracts.homework2;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getResponsibilities() {
        return job.getResponsibilities();
    }
    public int getSalary(){return job.getSalary();}

}
