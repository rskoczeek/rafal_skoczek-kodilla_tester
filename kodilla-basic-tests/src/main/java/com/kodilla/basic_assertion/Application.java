package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        }

        else {
            System.out.println("Metoda działa niepoprawnie dla liczb " + a + " i " + b);
        }

    }
}
