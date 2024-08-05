package Homework;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic
		int number1=2;
		int number2=3; 
		System.out.println("Following is the arithmetic operator addition of :"
				+ ""+number1+" and "+number2+" = "+(number1+number2));
		System.out.println("Following is the arithmetic operator subtraction of :"+number1+" and "
				+number2+" = "+(number1-number2));
		System.out.println("Following is the arithmetic operator multiplication of :"+number1+" and "
				+number2+" = "+(number1*number2));
		System.out.println("Following is the arithmetic operator division of :"+number1+" and "
				+number2+" = "+(number1/number2));
		System.out.println("Following is the arithmetic operator modulo of :"+number1+" and "
				+number2+" = "+(number1%number2));
		
		//Increment and decrement
		System.out.println("This is pre-increment");
		int i=2;
		int j= ++i;
		System.out.println("Type 1: This is i = "+i+" this is j = "+j);//returns new value for both
		int k =2;
		int m=k++;
		System.out.println("Type 2: This is post-increment");
		System.out.println("This is m = "+m+" this is k = "+k);//Returns original value for k as m
		
		System.out.println("This is decrement");
		int a=2;
		int b=--a;
		System.out.println("Type 1 : Pre decrement value of a = "+a+" value of b = "+b);//Returns new value
		int c=2;
		int d=c--;
		System.out.println("Type 2 : Post decrement value of c = "+c+" value of d = "+d);//Returns orginal value
		
		

	}

}
