package comp.techlabs.list;
import java.util.Random;

public class Account {

	    private String accountHolderName;
	    private double balance;
	    private String accountNumber;

	    public Account(String accountHolderName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	        this.accountNumber = generateAccountNumber();
	    }

	    private String generateAccountNumber() {
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 12; i++) {
	            sb.append(random.nextInt(10));  
	        }
	        return sb.toString();
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    @Override
	    public String toString() {
	        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + ", Balance: " + balance;
	    }
	}
