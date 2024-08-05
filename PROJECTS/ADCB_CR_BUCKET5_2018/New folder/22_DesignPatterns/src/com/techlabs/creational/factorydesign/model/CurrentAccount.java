package com.techlabs.creational.factorydesign.model;

public class CurrentAccount implements IAccount {
	private double balance;
	public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

	@Override
	public double creditAmount(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
        System.out.println("Credited " + amount + " to Savings account. New balance: " + balance);
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public double debitAmount(double amount) {
		// TODO Auto-generated method stub
		 if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Debited " + amount + " from Savings account. New balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds in Savings account.");
	        }
		return balance;
	}

}
