package com.techlabs.proxy.model;

public class BankAccount implements Account {
	@Override
    public void withdraw() {
		System.out.println("Withdrawing from bank account");

    }

    @Override
    public void getAccountNumber() {
    	System.out.println("getting account number from bank account");
    }

}
