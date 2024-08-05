package com.array.test;

import java.util.Scanner;

public class findNumTwoDArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = scn.nextInt();
        System.out.println("Enter columns:");
        int columns = scn.nextInt();
        
        int matrix[][] = new int[rows][columns];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        
        System.out.println("Your matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
            }
        System.out.println("Enter element to search : ");
        int searchElement = scn.nextInt();
        boolean found= false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(searchElement==matrix[i][j])
                {
                	System.out.println("Element found at position: (" + i + ", " + j + ")");
                	found=true;
                	break;
                }
                if(found)
                	break;
            }
          
            
            }
        if(!found)
        {
        	System.out.println("Couldn't find the number :");
        }

	}
}

















