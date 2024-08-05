package com.techlabs.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       int number1 = Integer.parseInt(args[0]);
       int number2 = Integer.parseInt(args[1]);
      
       double result = number1/number2;
       System.out.println("division = "+result);
      }
      catch(ArithmeticException e) {
    	  System.out.println("Invalid input for number 2 cannont be zero");
      }
      catch(ArrayIndexOutOfBoundsException e) 
		{
    	  System.out.println("You cannot pass less or more values pass exact 2 values");
      }
		catch(NumberFormatException e) {
			System.out.println("Please enter number values. Else division cannot be performed other than numbers");
			
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		 System.out.println("Exiting");
       
	}

}
