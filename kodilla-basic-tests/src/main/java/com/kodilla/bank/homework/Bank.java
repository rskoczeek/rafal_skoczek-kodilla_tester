package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getBalance(){
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum =+ cashMachines[i].getSaldo();
        }
        return sum;
    }

    public int getWithdrawalCount(){
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum =+ cashMachines[i].getWithdrawalCount();
        }
        return sum;
    }

    public int getDepositCount() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum =+ cashMachines[i].getDepositCount();
        }
        return sum;
    }

    public double getAverageWithdrawal(){
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum =+ cashMachines[i].getWithdrawalSum();
        }
        return sum / getWithdrawalCount();
    }

    public double getAverageDeposit(){
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum =+ cashMachines[i].getDepositSum();
        }
        return sum / getDepositCount();
    }
}


