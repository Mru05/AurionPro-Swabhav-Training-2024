package com.techlabs.iterative.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
			  int rem=0;
			  int sum=0;
			  int temp; 
			  System.out.println("Enter a number : ");
			  int num= scn.nextInt(); 
			  temp=num;    
			  while(num>0){    
			   rem=num%10;    
			   sum=(sum*10)+rem;    
			   num=num/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			  

	}


