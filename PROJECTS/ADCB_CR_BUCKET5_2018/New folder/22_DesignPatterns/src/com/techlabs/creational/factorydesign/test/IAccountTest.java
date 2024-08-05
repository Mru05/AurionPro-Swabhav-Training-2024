package com.techlabs.creational.factorydesign.test;
import com.techlabs.creational.factorydesign.model.CurrentAccount;
import com.techlabs.creational.factorydesign.model.IAccount;
import com.techlabs.creational.factorydesign.model.SavingAccount;

public class IAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IAccount savingsAccount = new SavingAccount(1000);
	        savingsAccount.creditAmount(200);
	        savingsAccount.debitAmount(150);

	        IAccount currentAccount = new CurrentAccount(2000);
	        currentAccount.creditAmount(300);
	        currentAccount.debitAmount(250);

}
}
