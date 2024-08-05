package com.techlabs.model;

import com.techlabs.exceptions.InsufficientBalanceException;

public class Account {
	
		    private int accountNumber;
		    private String name;
		    private double balance;

		    public Account(int accountNumber, String name, double balance) {
		        this.accountNumber = accountNumber;
		        this.name = name;
		        this.balance = balance;
		    }

		    public int getAccountNumber() {
				return accountNumber;
			}

			public void setAccountNumber(int accountNumber) {
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

			public void credit(double amount) {
		        this.balance += amount;
		    }

		    public void debit(double amount) throws InsufficientBalanceException {
		        if (this.balance < amount) {
		            throw new InsufficientBalanceException(this.balance, amount);
		        }
		        this.balance -= amount;
		    }
		}




