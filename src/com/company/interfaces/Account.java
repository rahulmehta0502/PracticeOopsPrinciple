package com.company.interfaces;

public class Account {

    private double balance = 5000;

    public Account() {
    }

    public double setBalanced(double amount) {
        return this.balance = this.balance + amount;
    }

    public double getBalance() {
        return balance;
    }



}
