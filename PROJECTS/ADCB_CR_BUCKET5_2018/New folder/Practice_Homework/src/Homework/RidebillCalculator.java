package Homework;

import java.util.Scanner;

public class RidebillCalculator {

	public static void main(String[] args) {
		int bill =0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to Ride Bill calculator");
		System.out.println("Please enter the height of the person : ");
		double height = scn.nextDouble();
		if(height<120)
		{
			System.out.println("Cannot ride");
		}
		else {
			System.out.println("Can ride ");
			System.out.println("Please enter the age");
			int age = scn.nextInt();
			if(age<12)
			{   
				bill= 5 ;
				
			}else if(age>=12 && age <=18) {
				bill = 7;
				
				}else if(age>18 && age<=44) {
					bill=12;
					
				}else if(age>44 && age<=55) {
					bill=0;
					
				}
			System.out.println("Your bill is : "+bill+"$");
			System.out.println("Choose your required Option :");
			System.out.println("Option 1: Want photos :");
			System.out.println("Option 2: Don't want photos :");
			int photos = scn.nextInt();
			
			switch(photos) {
			case 1:
			{
				int bill2= bill+3;
				System.out.println("Your total bill is : "+bill2+"$");
				break;
			}
			case 2:
			{
				System.out.println("Your bill is : "+bill+"$");
				break;
			}
				
			}
		
		}
		scn.close();
		}

	}


