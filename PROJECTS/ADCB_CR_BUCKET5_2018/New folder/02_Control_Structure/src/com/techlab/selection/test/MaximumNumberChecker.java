package com.techlab.selection.test;
import java.util.*;

public class MaximumNumberChecker {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numbers to check maximum number 1: ");
		int number1 = scn.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scn.nextInt();
		
		if(number1>number2)
		{
			System.out.println(number1+" is greater than "+number2);
		}
		else {
			System.out.println(number2+" is greater than "+number1);
		}
		
	}
	
	

}
