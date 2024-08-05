package Homework;
import java.util.*;
public class TimeConverter1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of minutes: ");
        int totalMinutes = scanner.nextInt();

        
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        
        System.out.println("Your required time is "+(hours)+" hours and "+(minutes)+" minutes");

	}

}
