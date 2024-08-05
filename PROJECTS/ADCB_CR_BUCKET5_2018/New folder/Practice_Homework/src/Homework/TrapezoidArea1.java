package Homework;
import java.util.*;

public class TrapezoidArea1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the first base(in cm): ");
        double base1 = scanner.nextDouble();

        System.out.print("Enter the length of the second base(in cm): ");
        double base2 = scanner.nextDouble();

        System.out.print("Enter the height(in cm): ");
        double height = scanner.nextDouble();

        
        double area = ((base1 + base2) / 2) * height;

        
        System.out.printf("The area of the trapezoid is(in cm): "+ area);

	}

}
