package com.techlab.selection.test;

import java.util.Scanner;

public class MaximumThreeNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numbers to check maximum number 1: ");
		int number1 = scn.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scn.nextInt();
		System.out.println("Enter number 3: ");
		int number3 = scn.nextInt();
		if(number1>number2 && number1>number3)
		{
			System.out.println("Number 1 is greater "+number1);
		}
		if(number2>number1 && number2>number3)
		{
			
		}
		
		

	}

}
