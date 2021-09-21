package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        int subResult = calculator.subtract(a, b);
        int squareResult = calculator.square(a);

        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        }
        else {
            System.out.println("Metoda działa niepoprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSubstract = ResultChecker.assertEquals(-3, subResult);
        if (correctSubstract) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        }


        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        }

        else {
            System.out.println("Metoda działa niepoprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);
        if (correctSquare) {
            System.out.println("Metoda działa poprawnie dla liczby " + a );
        }
        else {
            System.out.println("Metoda działa niepoprawnie dla liczby " + a);
        }

    }
}
