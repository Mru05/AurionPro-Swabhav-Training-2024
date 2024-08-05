package com.techlabs.iterative.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to find factorial : ");
		int num = scn.nextInt();
		int i =1;
		int fact =1;
		for(i=1;i<=num;i++)
		{
			fact = fact*1;
		}
       System.out.println(fact);
	}

}
