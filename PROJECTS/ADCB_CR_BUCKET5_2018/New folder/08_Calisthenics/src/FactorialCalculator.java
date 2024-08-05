import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to factorial ");
		int n = scn.nextInt();
		
		
		int factorial = calculatefactorial(n);
		System.out.println("Factorial is "+factorial);

	}
private static int calculatefactorial(int n) {
	int a =1;
	for(int i=1;i<n;i++) 
		a = a*i;
	   return a;
}
}
