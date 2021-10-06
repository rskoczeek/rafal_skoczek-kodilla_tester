package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroBalance(){
        CashMachine cashMachine = new CashMachine(new double[0]);
        double result = cashMachine.getSaldo();
        assertEquals(0, result);
    }

    @Test
    public void shouldHaveBalance(){
        CashMachine cashMachine = new CashMachine(new double[]{2.0, 1.0});
        double result = cashMachine.getSaldo();
        assertEquals(3.0, result);
    }
}
