package com.techlabs.proxy.model;

public class ATM implements Account{
	BankAccount bankAccount = new BankAccount();
	@Override
    public void withdraw() {
        //Access using actual object. You can also have checks on withdraw to achieve authentication or pin is correct or not.
        
        bankAccount.withdraw();
    }

    @Override
    public void getAccountNumber() {
    	
         bankAccount.getAccountNumber();
    }

}
