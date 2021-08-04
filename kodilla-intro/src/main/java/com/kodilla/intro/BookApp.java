package com.kodilla.intro;

public class BookApp {
    public static void main(String[] args) {
        String book = "com.kodilla.intro.Book of " + Book.author() + ", " + Book.title();

        System.out.println(book);
    }
}
