package com.kodilla.bank.homework;

public class Bank {
    private String maschine;
    private CashMachine deposit;
    private CashMachine debit;


    public Bank (String maschine) {
        this.maschine = maschine;
        this.deposit = new CashMachine();
        this.debit = new CashMachine();

    }
    public void addTransaction(double transaction) {
        if (transaction > 0) {
            this.deposit.moneyMovment(transaction);
        }
        if (transaction < 0) {
            this.debit.moneyMovment(transaction);
        }
    }
    }
