package comp.apro.model;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter numbers to be swapped number 1");
		int number1= Integer.parseInt(args[0]);
		System.out.println("Enter numbers to be swapped number 2");
		int number2= Integer.parseInt(args[1]);
		
		System.out.println("Before Swapping this is num 1 : "+number1+ "\t and this is num 2 : "+number2);
		
		int temp= number1;
		number1=number2;
		number2 = temp;
		
		System.out.println("After Swapping this is num 1 : "+number1+ "\t and this is num 2 : "+number2);

	}

}
