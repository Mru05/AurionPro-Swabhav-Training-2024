package Homework;

import java.util.Scanner;

public class MoneyCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to Money Calculator");
		System.out.println("Enter the amount to calculate : ");
		int cash = scn.nextInt();
		if(cash == 50000) {
			System.out.println("Please enter the amount less than 50000");
			
		}
		else if(cash%100!=0) {
			System.out.println("Please enter the amount in multiples of 100");
		}
		else {
			int twoThousand = cash/2000;
			cash %=2000;
			
			int fiveHundred = cash/500;
			cash %=500;
			
			int twoHundred = cash/200;
			cash %=200;
			
			int oneHundred = cash/100;
			cash %=100;
			
			System.out.println("Two Thousand : "+twoThousand);
			System.out.println("Five Hundred : "+fiveHundred);
			System.out.println("Two Hundred : "+twoHundred);
			System.out.println("One Hundred : "+oneHundred);
		}
		

	}

}
