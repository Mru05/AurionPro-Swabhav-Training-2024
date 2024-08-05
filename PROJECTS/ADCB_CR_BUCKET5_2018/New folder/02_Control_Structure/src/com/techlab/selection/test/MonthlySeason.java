package com.techlab.selection.test;

import java.util.Scanner;

public class MonthlySeason {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter month number to check season : ");
		int season = scn.nextInt();
		
		switch(season)
		{
		case 10:
		case 11:
		case 12:
		case 1: System.out.println("This is  winter month");
		        break;
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("This is summer month");
		       break;
		case 6:
		case 7:
		case 8:
		case 9:System.out.println("This i s rainy month");
		       break;
		}

	}

}
