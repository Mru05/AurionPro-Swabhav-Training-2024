package com.techlabs.iterative.test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scn.nextInt();
		int temp = num;
		
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
