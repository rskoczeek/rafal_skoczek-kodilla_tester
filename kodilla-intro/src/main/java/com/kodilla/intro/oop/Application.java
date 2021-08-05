package com.kodilla.intro.oop;

public class Application {

    public static void main(String[] args) {

        User user = new User("Adam", 40.5, 178);

        if (user.hasName()) {
            if (user.isOlder(30) && user.isHigher(160)) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}