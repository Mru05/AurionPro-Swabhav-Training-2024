package Homework;

public class OperatorsTest {

	public static void main(String[] args) {
		System.out.println("Logical Operators");
		int a=2;
		int b= 3;
		System.out.println("For &&");
		System.out.println("And conditions if both are true a>b && b>=0 = "+(a>b && b>=0));
		System.out.println("And conditions if one of them is true a<b && b>=0 = "+(a<b && b>=0));
		System.out.println("And conditions if both are false a<b && b<=0 = "+(a<b && b<=0));
		System.out.println("");
		System.out.println("For ||");
		System.out.println("OR conditions if both are true a>b || b>=0 = "+(a>b || b>=0));
		System.out.println("OR conditions if one of them is true a<b || b>=0 = "+(a<b || b>=0));
		System.out.println("OR conditions if both are false a<b || b<=0 = "+(a<b || b<=0));
		

	}

}
