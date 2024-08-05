package com.techlabs.iterative.test;

import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the number to check Prime Number :");
	int num = scn.nextInt();
	int i =1,sum=0;
	
	while(i<=num/2)
	{
		if (num%i==0) {
			
			 break;
			
		}	
		++i;
		}
	if(sum==num)
		System.out.println("It is prime");
	else
		System.out.println("Not prime");
}
}
