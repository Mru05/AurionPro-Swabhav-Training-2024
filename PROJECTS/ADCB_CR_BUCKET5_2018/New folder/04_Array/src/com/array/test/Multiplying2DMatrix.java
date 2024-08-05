package com.array.test;

import java.util.Scanner;

public class Multiplying2DMatrix {

    public static void main(String[] args) {
        int row1, col1, row2, col2;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows for first matrix: ");
        row1 = scn.nextInt();
        System.out.println("Enter number of columns for first matrix: ");
        col1 = scn.nextInt();
        System.out.println("Enter number of rows for second matrix: ");
        row2 = scn.nextInt();
        System.out.println("Enter number of columns for second matrix: ");
        col2 = scn.nextInt();

        if (col1 != row2) {
            System.out.println("Cannot perform matrix multiplication. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        } else {
            int[][] a = new int[row1][col1];
            int[][] b = new int[row2][col2];
            int[][] result = new int[row1][col2]; // Resultant matrix

            System.out.println("Enter the values for the first matrix:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    a[i][j] = scn.nextInt();
                }
            }

            System.out.println("Enter the values for the second matrix:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    b[i][j] = scn.nextInt();
                }
            }

            // Perform matrix multiplication
            System.out.println("Matrix Multiplication is:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}
