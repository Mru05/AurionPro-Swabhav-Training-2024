package com.array.test;
import java.util.Scanner;

	public class ProductArray {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	       
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int[] prod = new int[n];

	       
	        for (int i = 0; i < n; i++) {
	            prod[i] = 1;
	        }

	       
	        int left = 1;
	        for (int i = 0; i < n; i++) {
	            prod[i] *= left;
	            left *= array[i];
	        }

	       
	        int right = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            prod[i] *= right;
	            right *= array[i];
	        }

	       
	        System.out.print("Product array: ");
	        for (int value : prod) {
	            System.out.print(value + " ");
	        }
	    }
	}



