package comp.homework.arrays;
import java.util.*;
import java.io.*;


public class SquaringArrays {

	
		// Java program to Sort square of the numbers
		// of the array
	
			public static void sortSquares(int arr[])
			{
				int n = arr.length;
				// first divide the array into negative and positive part
				int k;
				for (k = 0; k < n; k++) {
					if (arr[k] >= 0)
					break;
				}
				int i = k - 1; 
				int j = k; 
				int ind = 0; 

				int[] temp = new int[n];
				while (i >= 0 && j < n) {
					if (arr[i] * arr[i] < arr[j] * arr[j]) {
						temp[ind] = arr[i] * arr[i];
						i--;
					}
					else {

						temp[ind] = arr[j] * arr[j];
						j++;
					}
					ind++;
				}

				while (i >= 0) {
					temp[ind++] = arr[i] * arr[i];
					i--;
				}
				while (j < n) {
					temp[ind++] = arr[j] * arr[j];
					j++;
				}

				// copy 'temp' array into original array
				for (int x = 0; x < n; x++)
					arr[x] = temp[x];
			}

			// Driver program to test above function
			public static void main(String[] args)
			{
				int arr[] = { -4, -5, -7, 2, 4, 5 };
				int n = arr.length;

				System.out.println("Before sort ");
				for (int i = 0; i < n; i++)
					System.out.print(arr[i] + " ");

				sortSquares(arr);
				System.out.println("");
				System.out.println("After Sort ");
				for (int i = 0; i < n; i++)
					System.out.print(arr[i] + " ");
			}
		

	}


