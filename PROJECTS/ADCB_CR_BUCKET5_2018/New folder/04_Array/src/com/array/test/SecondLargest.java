package com.array.test;
import java.util.Arrays;
import java.util.Scanner;

	public class SecondLargest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] inputArray = new int[size];
	        System.out.println("Enter " + size + " elements:");

	        for (int i = 0; i < size; i++) {
	            inputArray[i] = scanner.nextInt();
	        }

	        Arrays.sort(inputArray); // Sort the array in ascending order
	        int secondLargest = inputArray[size - 2]; // Second largest element

	        System.out.println("The second largest element is: " + secondLargest);

	        scanner.close();
	    }
	}



