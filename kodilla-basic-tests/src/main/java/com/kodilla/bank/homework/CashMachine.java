package com.kodilla.bank.homework;

public class CashMachine {

    private double[] cashOperations;
    private int operationsNumber;

    public CashMachine() {
        this.operationsNumber = 0;
        this.cashOperations = new double[0];
    }

    public void moneyMovment(double value){
        this.operationsNumber++;
        double[] newTab = new double[this.operationsNumber];
        System.arraycopy(cashOperations, 0, newTab, 0, cashOperations.length);
        newTab[this.operationsNumber - 1] = value;
        this.cashOperations = newTab;
    }
    public int getOperationsNumber() {

        return operationsNumber;
    }

    public double getBalance() {
        double sum = 0;
        for (int i = 0; i < cashOperations.length; i++) {
            sum += this.cashOperations[i];
        }
        return sum;
        }
    }

