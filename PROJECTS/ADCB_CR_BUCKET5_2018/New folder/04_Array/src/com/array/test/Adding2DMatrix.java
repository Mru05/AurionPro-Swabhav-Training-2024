package com.array.test;

import java.util.Scanner;

public class Adding2DMatrix {
    public static int[][] matrixAccepting() {
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
        return matrix;
    }

    public static int[][] matrixAccepting2() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your second matrix:");
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
        return matrix;
    }

    public static void matrixAdding(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Error: Matrices have different dimensions and cannot be added.");
            return;
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] addedMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                addedMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The added matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(addedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = matrixAccepting();
        int[][] matrix2 = matrixAccepting2();
        matrixAdding(matrix1, matrix2);
    }
}
