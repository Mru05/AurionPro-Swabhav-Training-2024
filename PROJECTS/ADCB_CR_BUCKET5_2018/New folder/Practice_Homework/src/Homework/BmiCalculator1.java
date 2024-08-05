package Homework;
import java.util.Scanner;

public class BmiCalculator1 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter your weight in kilograms: ");
		        double weight = scanner.nextDouble();

		        System.out.print("Enter your height in meters: ");
		        double height = scanner.nextDouble();

		       
		        double bmi = weight / (height * height);

		        
		        System.out.printf("Your BMI is: " +bmi);

		   
		    }


	}

