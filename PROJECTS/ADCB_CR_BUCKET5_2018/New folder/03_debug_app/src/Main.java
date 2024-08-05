import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("enter number: ");
       int number1 = scn.nextInt();
       int number2 = scn.nextInt();
       int result = addition(number1,number2);
       int result2 = subraction(number1,number2);
       int result3 = multiplication(number1,number2);
       int result4 = division(number1,number2);
       
       System.out.println("Addition : "+result);
       System.out.println("Subraction :"+result2);
       System.out.println("Multiplication : "+result3);
       System.out.println("Division : "+result4);
       
       
	}
	private static int addition(int number1,int number2)
	{
		return number1+number2;
		
	}
	private static int subraction(int number1,int number2)
	{
		
		return number1-number2;
		
		
	}
	private static int multiplication(int number1,int number2)
	{
		return number1*number2;
	}
	private static int division(int number1,int number2)
	{
		return number1/number2;
	}

}
