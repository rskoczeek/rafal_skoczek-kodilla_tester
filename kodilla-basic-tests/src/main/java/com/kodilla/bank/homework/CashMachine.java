package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;

    public CashMachine(double[] transactions) {
        this.transactions = transactions;
    }

    public int getTransactionsCount() {
        return transactions.length;
    }

    public double getSaldo() {
        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getWithdrawalCount(){
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += 1;
            }
        }
        return sum;
    }

    public int getDepositCount(){
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum += 1;
            }
        }
        return sum;
    }

    public double getWithdrawalSum(){
        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
            }
        }
        return sum;
    }

    public double getDepositSum(){
        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum += transactions[i];
            }
        }
        return sum;
    }
}


