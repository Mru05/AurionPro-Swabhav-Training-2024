package com.array.test;

import java.util.Scanner;

public class MaxTwoDArray {

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
        
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        
        System.out.println("The maximum element in the matrix is: " + maxElement);
        
        scn.close();
    }
}
