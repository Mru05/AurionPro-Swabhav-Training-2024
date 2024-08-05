package Homework;

public class TrapezoidArea2 {

	public static void main(String[] args) {
		System.out.print("Enter the length of the first base(in cm): ");
		double base1 = Double.parseDouble(args[0]);
        

        System.out.print("Enter the length of the second base(in cm): ");
        double base2 = Double.parseDouble(args[1]);
        

        System.out.print("Enter the height(in cm): ");
        double height = Double.parseDouble(args[2]);

        
        double area = ((base1 + base2) / 2) * height;

        
        System.out.printf("The area of the trapezoid is(in cm): "+ area);


	}

}
