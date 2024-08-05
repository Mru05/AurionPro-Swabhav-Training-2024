package com.techlab.selection.test;
import java.util.*;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to check positive or negative :");
		int number = scn.nextInt();
		if(number>0)
		{
			System.out.println("It is a positive number");
		}
		else
		{
			System.out.println("It is a negative number");
		}
		

	}

}
