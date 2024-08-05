import java.util.Scanner;

public class EvenOddchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to check ");
		int n = scn.nextInt();
		if(n%2==0) {
			System.out.println("Number is even");
		   return;
		}
		
			System.out.println("Number is odd");
	}

}
