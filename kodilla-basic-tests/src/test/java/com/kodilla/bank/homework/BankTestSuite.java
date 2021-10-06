package com.kodilla.bank.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine1 = new CashMachine(new double[]{1.0, 2.0, 3.0});
        CashMachine cashMachine2 = new CashMachine(new double[]{1.0, 2.0, 3.0});
        CashMachine cashMachine3 = new CashMachine(new double[]{1.0, 2.0, 3.0});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3});
        double result = bank.getBalance();
        assertEquals(18.0, result);
    }
    @Test
    public void shouldCalculateAvarageDeposit() {
        CashMachine cashMachine1 = new CashMachine(new double[]{0.0, 1.0, 1.0});
        CashMachine cashMachine2 = new CashMachine(new double[]{1.0, -1.0, .0});
        CashMachine cashMachine3 = new CashMachine(new double[]{1.0, 2.0, 3.0});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3});
        double result = bank.getAverageDeposit();
        assertEquals(1.0, result);
    }
    @Test
    public void shouldCalculateAverageWithdrawal() {
        CashMachine cashMachine1 = new CashMachine(new double[]{1.0, -1.0, 1.0});
        CashMachine cashMachine2 = new CashMachine(new double[]{-1.0, 1.0, 1.0});
        CashMachine cashMachine3 = new CashMachine(new double[]{-12.0, 1.0, -1.0});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3});
        double result = bank.getAverageWithdrawal();
        assertEquals(-1.0, result);
    }

}
