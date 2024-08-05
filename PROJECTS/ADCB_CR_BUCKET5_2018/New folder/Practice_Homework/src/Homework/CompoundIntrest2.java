package Homework;

public class CompoundIntrest2 {

	public static void main(String[] args) {
		System.out.print("Enter the principal amount: ");
		double principal = Double.parseDouble(args[0]);
        System.out.print("Enter the rate of interest (in %): ");
        double rate = Double.parseDouble(args[1]);
        System.out.print("Enter the time (in years): ");
        int time = Integer.parseInt(args[2]);

        
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;
        

       
        System.out.println("The compound interest is: "+ compoundInterest);
        System.out.println("The total amount after "+ (time)+" years is = " +(amount));


	}

}
