package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

import com.techlabs.model.Accounts;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Accounts> account = new ArrayList<>();
        account.add(new Accounts(12100,"Mrunalini",120.0));
        account.add(new Accounts(12200,"Sanjay",1200.0));
        account.add(new Accounts(12300,"Neha",1300.0));
        account.add(new Accounts(12400,"Shivam",500.0));
        
        System.out.println(account);
        
        Accounts minBalanceAccount = account.stream()
                .min((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()))
                .orElse(null);
        System.out.println("Account with minimum balance: " + minBalanceAccount.getName());
        
     // Find account with maximum balance
        Accounts maxBalanceAccount = account.stream()
                .max((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()))
                .orElse(null);
        System.out.println("Account with maximum balance: " + maxBalanceAccount.getName());

        // Filter names greater than 6 characters
        List<String> names1 = account.stream()
                .map(Accounts::getName)
                .filter(Name -> Name.length()>6)
                .collect(Collectors.toList());
        System.out.println("Names greater than 6 characters: " + names1);
        
        //total balance
        double totalBalance = (account.stream()
                .mapToDouble(Accounts::getBalance))
                .sum();
        System.out.println("Total balance of all accounts: " + totalBalance);
        
        
        

      
        
	}

}
