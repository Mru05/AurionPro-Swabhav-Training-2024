package Homework;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		//and operator
		System.out.println("And conditions if both are true a>b && b>=0 = "+(a>b && b>=0));
		System.out.println("And conditions if one of them is true a<b && b>=0 = "+(a<b && b>=0));
		System.out.println("And conditions if both are false a<b && b<=0 = "+(a<b && b<=0));
		
		System.out.println("");
		//Or operator
		
		System.out.println("OR conditions if both are true a>b && b>=0 = "+(a>b || b>=0));
		System.out.println("OR conditions if one of them is true a<b && b>=0 = "+(a<b || b>=0));
		System.out.println("OR conditions if both are false a<b && b<=0 = "+(a<b || b<=0));
		
		System.out.println("");
		//NOT operator
		
		System.out.println("NOT conditions for !(a>b && b>=0) = "+!(a>b && b>=0));
		System.out.println("NOT condition for !(a<b || b>=0) = "+ !(a<b || b>=0));
		System.out.println("NOT conditions for !(a<b && b<=0) = "+ !(a<b && b<=0));
	

	}

}
