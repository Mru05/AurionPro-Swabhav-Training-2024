package Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a;
        int b;
        int ans = 0;
        
        System.out.println("Enter number 1: ");
        a = scn.nextInt();
        System.out.println("Enter number 2: ");
        b = scn.nextInt();
        System.out.println("Select the type of operation [For eg. +,-,*,/]: ");
        char operator = scn.next().charAt(0);
        
        switch (operator) {
            case '+':
                ans = a + b;
                System.out.println("Following is the addition of the numbers: "+a+" and "+  b + " = "  + ans);
                break;
            case '-':
                ans = a - b;
                System.out.println("Following is the subtraction of the numbers: "+a+" and "+ b+ " = "  + ans);
                break;
            case '*':
                ans = a * b;
                System.out.println("Following is the multiplication of the numbers: " +a+" and "+ b+ " = "  + ans);
                break;
            case '/':
                if (b != 0) {
                    ans = a / b;
                    System.out.println("Following is the division of the numbers: " +a+" and "+  b+ " = " + ans);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Wrong operation chosen");
                break;
        }
    }
}
