package comp.apro.model;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please Enter first number : ");
		int number1 = Integer.parseInt(args[0]);
		
		System.out.println("Please Enter Second number : ");
		int number2 = Integer.parseInt(args[1]);
		
		
		System.out.println("The numbers before swapping are number 1 : "+number1+"  number 2 is:"+number2);
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("The numbers after swapping are number 1 : "+number1+" number 2 is :"+number2);

	}

}
