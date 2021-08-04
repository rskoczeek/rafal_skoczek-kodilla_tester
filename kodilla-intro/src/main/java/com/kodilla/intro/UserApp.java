package com.kodilla.intro;

public class UserApp {

    public static void main(String[] args) {

        User bartek = new User("Bartek", 24);
        User zofia = new User("Zofia", 35);
        User kasia = new User("Kasia", 19);
        User piotr = new User("Piotr", 44);
        User zbyszek = new User("Zbyszek", 55);
        User[] users = {bartek, zofia, kasia, piotr, zbyszek};

        System.out.println(getAvarageAge(users));
       //System.out.println(getUsersUnderAvarage(users));
    }


    public static double getAvarageAge(User[] users) {
        double result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();
        }
        return result / users.length;
    }
  /*  public static String getUsersUnderAvarage(com.kodilla.intro.User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (getAvarageAge() > users[i].getAge(users)) {
                return users[i].getName();
            }
        }
    }*/

}