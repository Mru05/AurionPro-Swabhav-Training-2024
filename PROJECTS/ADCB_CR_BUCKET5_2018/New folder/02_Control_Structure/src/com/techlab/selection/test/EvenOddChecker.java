package com.techlab.selection.test;
import java.util.*;

public class EvenOddChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter the number to check even or odd : ");
		int a= scanner.nextInt();
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		
	}

}
