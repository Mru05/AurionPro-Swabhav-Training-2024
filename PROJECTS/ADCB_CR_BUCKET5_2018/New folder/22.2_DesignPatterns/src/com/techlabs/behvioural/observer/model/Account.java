package com.techlabs.behvioural.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private String accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
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
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public Account(String accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<>();
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	//Deposit method
	public void deposit(double amount) {
		
		balance += amount;
		notifyAllNotifiers("credited",amount);
		
	}

	
	public void withdraw(double amount) throws InsufficientFundSException{
		 if (balance < amount) {
	            throw new InsufficientFundSException("Insufficient funds for withdrawal.");
	        }
	        balance -= amount;
	        notifyAllNotifiers("debited",amount);
	    }
	
    public void registerNotifier(INotifier notifier) {
        notifiers.add(notifier);
    }

    
    private void notifyAllNotifiers(String transactionType, double amount) {
        for (INotifier notifier : notifiers) {
            notifier.notify(this, transactionType, amount);
        }
    }
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}
		
	}
	


