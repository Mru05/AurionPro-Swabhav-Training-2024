package com.array.test;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		int max=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size of numbers to add : ");
		int size = scn.nextInt();
		int array[] = new int[size];  
		for(int i=0;i<size;i++)
		{
			array[i]= scn.nextInt(); 
		}
		System.out.println("Array is : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i] + " ");
		}
		for(int i=0;i<array.length;i++)
		{
		    
		    if(array[i]>max)
		    {
		    	max = array[i];
		    }
		   
		}
		 System.out.println("Maximum is : "+max);

	}

}
