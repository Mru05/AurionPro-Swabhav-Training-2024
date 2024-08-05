package com.techlabs.iterative.test;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		int sum=0;
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the number to add : ");
	int number = scn.nextInt();
	
	while(number>0)
	{
		int rem= number%10;
		sum +=rem;
		number = number/10;	
	}
	System.out.println("Sum of numbers : "+sum);
		
	}

}
