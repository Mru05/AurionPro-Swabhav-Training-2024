package com.array.test;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		int sum =0;
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
		for(int i=0;i<size;i++)
		{
			sum = sum+array[i];
			
		}
		System.out.println("Sum is "+sum);

	}

}
