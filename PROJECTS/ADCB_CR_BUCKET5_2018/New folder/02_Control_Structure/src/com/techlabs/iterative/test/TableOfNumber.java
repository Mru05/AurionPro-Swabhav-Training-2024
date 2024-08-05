package com.techlabs.iterative.test;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number to find table : ");
		int tab = scn.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			int j=tab*i;
			System.out.println(j);
		}

	}

}
