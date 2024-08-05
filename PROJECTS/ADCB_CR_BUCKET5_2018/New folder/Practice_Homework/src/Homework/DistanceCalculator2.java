package Homework;

public class DistanceCalculator2 {

	public static void main(String[] args) {
		    System.out.print("Enter x1: ");
		    double x1 = Double.parseDouble(args[0]);
	        System.out.print("Enter y1: ");
	        double y1 = Double.parseDouble(args[1]); 
	        System.out.print("Enter x2: ");
	        double x2 = Double.parseDouble(args[2]);
	        
	        System.out.print("Enter y2: ");
	        double y2 = Double.parseDouble(args[3]);

	       
	        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1/2, 2) );
	        
	        System.out.println("Distance between the points = "+(distance));

	}

}
