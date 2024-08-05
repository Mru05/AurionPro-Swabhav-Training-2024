package com.array.test;

import java.util.Scanner;

public class TwoDArray {

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
        
        scn.close(); 
    }
}
