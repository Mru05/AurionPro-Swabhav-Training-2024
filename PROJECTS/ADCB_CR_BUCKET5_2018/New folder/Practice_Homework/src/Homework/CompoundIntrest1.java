package Homework;
import java.util.*;

public class CompoundIntrest1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

       
        System.out.println("The compound interest is: "+ compoundInterest);
        System.out.println("The total amount after "+ (time)+" years is = " +(amount));

	}

}
