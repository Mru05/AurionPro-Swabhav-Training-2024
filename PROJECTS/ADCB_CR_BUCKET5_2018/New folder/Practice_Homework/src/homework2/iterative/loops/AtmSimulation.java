package homework2.iterative.loops;
import java.util.Scanner;

public class AtmSimulation {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int balance = 10000;
		        boolean exit;
		        System.out.println("Welcome to out bank. Please choose any option from below : ");

		        do {
		            System.out.println("ATM Menu:");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Deposit Money");
		            System.out.println("3. Withdraw Money");
		            System.out.println("4. Exit");
		            System.out.print("Please choose an option: ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.printf("Your current balance is: " + balance);
		                    exit = false;
		                    break;
		                case 2:
		                    System.out.print("Enter amount to deposit: ");
		                    int depositAmount = scanner.nextInt();
		                     balance += depositAmount;
		                     System.out.printf("You have deposited : "+ depositAmount + " Your new balance is" + balance);
		                    exit = false;
		                    break;
		                case 3:
		                    System.out.print("Enter amount to withdraw: ");
		                    int withdrawAmount = scanner.nextInt();
		                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
		                        balance -= withdrawAmount;
		                        System.out.printf("You have withdrawn "+withdrawAmount+" Your new balance is : "+ balance);
		                    } else if (withdrawAmount > balance) {
		                        System.out.println("Insufficient amount");
		                    } else {
		                        System.out.println("Invalid withdraw amount.");
		                    }
		                    exit = false;
		                    break;
		                case 4:
		                    System.out.println("Thank you for using the ATM. Goodbye!");
		                    exit = true;
		                    break;
		                default:
		                    System.out.println("Invalid input. Please select a correct option.");
		                    exit = false;
		                    break;
		            }
		        } while (!exit);

		        scanner.close();
		    }
		}


