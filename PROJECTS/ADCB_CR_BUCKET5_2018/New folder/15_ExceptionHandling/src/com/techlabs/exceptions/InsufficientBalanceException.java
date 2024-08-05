package com.techlabs.exceptions;

public class InsufficientBalanceException extends Exception {
	 private double balance;
	    private double amount;

	    public InsufficientBalanceException(double balance, double amount) {
	        super("Insufficient balance. Current balance: " + balance + ", amount you entered : " + amount);
	        this.balance = balance;
	        this.amount = amount;
	    }

}
