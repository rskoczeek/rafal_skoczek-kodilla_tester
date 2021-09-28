package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroBalance(){
        CashMachine cashMachine = new CashMachine();
        double[] cashOperations = cashMachine.getBalance();
        assertEquals(0, cashOperations.length);
    }
}
