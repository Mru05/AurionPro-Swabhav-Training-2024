package com.techlabs.model;

enum AccountType {
    SAVING, CURRENT;
}

public class BankingApp {
    private long accountNumber;
    private String name;
    private double balance;
    private AccountType accountType;

    public BankingApp(long accountNumber, String name, double balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
