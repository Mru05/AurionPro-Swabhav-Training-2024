package com.techlab.selection.test;

import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Character to check :");
		char ch = scn.next().charAt(0);
		
		switch(ch) {
		case 'a': System.out.println("It is a vowel"); 
		          break;
		case 'e': System.out.println("It is a vowel"); 
		          break;
		case 'i': System.out.println("It is a vowel"); 
		          break;
		case 'o': System.out.println("It is a vowel");
		          break;
		case 'u': System.out.println("It is a vowel"); 
		          break;
		default : System.out.println("Not a vowel");
		}
		
	}

}
