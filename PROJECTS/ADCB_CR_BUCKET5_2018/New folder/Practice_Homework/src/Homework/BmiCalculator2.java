package Homework;

public class BmiCalculator2 {

	public static void main(String[] args) {
		 System.out.println("Enter your weight in kilograms: ");
		 double weight = Double.parseDouble(args[0]);
	        

	        System.out.println("Enter your height in meters: ");
	        double height = Double.parseDouble(args[1]);

	        
	        double bmi = weight / (height * height);

	        
	        System.out.println("Your BMI is: " +bmi);

	}

}
