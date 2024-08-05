package Homework;

public class TimeConverter2 {

	public static void main(String[] args) {
		 System.out.println("Enter the number of minutes: ");
		 int totalMinutes = Integer.parseInt(args[0]);

	        
	        int hours = totalMinutes / 60;
	        int minutes = totalMinutes % 60;

	        
	        System.out.println("Your required time is "+(hours)+" hours and "+(minutes)+" minutes");

	}

}
