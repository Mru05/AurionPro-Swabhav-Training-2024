package com.techlab.selection.test;

import java.util.Scanner;

public class WaterBillCalculator {

	public static void main(String[] args) {
		int meterCharge = 75;
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number of units : ");
		int units = scn.nextInt();
		int charge2 = 0;
		if(units<=100)
		{
			charge2 = (units*5);
			System.out.println("The total unit bill is :"+charge2);
		}
		else {
				if(units<=250)
				{   
					charge2 = (100*5)+(units -100)*10;
					System.out.println("The total unit bill is :"+charge2);
				}
				else {
					charge2 =(100*5)+(150*10)+(units-250)*20;
				}
				int waterbill= meterCharge+charge2;
				System.out.println("This your Water Bill :"+waterbill);
			}
		}

	}


