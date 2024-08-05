package com.techlabs.model;

import com.techlabs.exceptions.InsufficientBalanceException;

public class Debit {
	private Account account;

    public Debit(Account account) {
        this.account = account;
    }
    public void debit(double amount) throws InsufficientBalanceException {
        account.debit(amount);
    }
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

}
