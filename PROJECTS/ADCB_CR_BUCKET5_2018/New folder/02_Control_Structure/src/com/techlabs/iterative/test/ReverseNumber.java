package com.techlabs.iterative.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to reverse : ");
		int number = scn.nextInt();
		int rem =0;
		while(number>0)
		{
			number %=10;
			number++;
			number /=10;
			number = rem;
			
		}
		System.out.println(number);

	}

}
