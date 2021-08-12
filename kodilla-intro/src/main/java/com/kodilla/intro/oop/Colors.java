package com.kodilla.intro.oop;

public class Colors {
    public String color() {
        String chooseColor = UserDialogs.getUserColor();
        String result = "x";

        switch (chooseColor) {
            case "W":
                result = "White";
                break;                     // [1]
            case "B":
                result = "Black";
                break;                     // [2]
            case "R":
                result = "Red";
                break;                     // [3]
            case "Y":
                result = "Yellow";
                break;                     // [4]
        }
        return result;
    }
}
