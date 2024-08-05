package com.techlabs.model;

public class Credit {
	private Account account;

    public Credit(Account account) {
        this.account = account;
    }

    public void credit(double amount) {
        account.credit(amount);
    }

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
