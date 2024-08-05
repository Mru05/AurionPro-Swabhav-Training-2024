package com.techlabs.iterative.test;

import java.util.Scanner;

public class AdditionOfPowers {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = scn.nextInt();
	int temp = num;
	int pow =0;
	int sum=0;
	
	while(num>0)
	{
		pow++;
		num /=10;
		
	}
	temp=num;
	while(num>0)
	{
		int rem = num%10;
		sum += Math.pow(rem,3);
		num /=10;
		
	}
	if(sum==temp)
	{
		System.out.println("Armstrong Number");
	}
	else
		System.out.println("Not an Armstrong Number");

	}

}
