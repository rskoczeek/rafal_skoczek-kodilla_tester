package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {
        Calculator subCalculator = new Calculator();
        int a = 97;
        int b = 9;
        int subResult = subCalculator.subtract(a, b);
        assertEquals(88,subResult);
    }
    @Test
    public void testSquare(){
        Calculator squareCalculator = new Calculator();
        int a = 5;
        int squareResult = squareCalculator.square(a);
        assertEquals(25,squareResult);
    }
}
