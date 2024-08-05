package com.techlabs.run;

import com.techlabs.model.Account;

public class SavingAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingAccount(int accno, String name, int balance) {
        super(accno, name, balance);
    }

  

	public SavingAccount(int choice, String name, double balance, double minBalance) {
		super(choice,name,balance,minBalance);
		// TODO Auto-generated constructor stub
	}



	@Override
    public void debit(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Amount debited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Cannot debit. Minimum balance should be maintained.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Account Type: Savings");
        System.out.println("Minimum Balance: " + MIN_BALANCE);
    }

    public double getBalance() {
        return balance;
    }



	public void random() {
		// TODO Auto-generated method stub
		
	}
}