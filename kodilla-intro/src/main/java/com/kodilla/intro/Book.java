package com.kodilla.intro;

import java.util.Scanner;
public class Book {
    public static String author() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter authors full name:");
            String fullName = scanner.nextLine().trim();
            if (fullName.length() >= 2) {
                return fullName;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String title() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter books title:");
            String title = scanner.nextLine().trim();
            if (title.length() >= 2) {
            }
            System.out.println("Title is too short. Try again.");
        }
    }
    public static void main(String[] args) {
        String book = "com.kodilla.intro.Book of " + Book.author() + ", " + Book.title();

        System.out.println(book);
    }
}


