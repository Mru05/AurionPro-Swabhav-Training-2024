package com.array.test;
import java.util.Scanner;
	

	public class SortedSquares {

	    public static int[] sortedSquares(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        int left = 0, right = n - 1;
	        int index = n - 1;

	        while (left <= right) {
	            int leftSquare = nums[left] * nums[left];
	            int rightSquare = nums[right] * nums[right];
	            if (leftSquare > rightSquare) {
	                result[index] = leftSquare;
	                left++;
	            } else {
	                result[index] = rightSquare;
	                right--;
	            }
	            index--;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	       
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	       
	        int[] result = sortedSquares(array);

	       
	        System.out.print("Sorted squares array: ");
	        for (int value : result) {
	            System.out.print(value + " ");
	        }
	    }
	}



