package com.techalbs.strategy.test;

import com.techlabs.strategy.model.AddOperation;
import com.techlabs.strategy.model.MultiplyOperation;
import com.techlabs.strategy.model.OperationStrategy;

public class OperationTest {
	public static void main(String[] args) {
	    OperationStrategy op = new OperationStrategy(new AddOperation());

	   
	    System.out.println("Result of adding: " + op.doOperation(10, 5));

	   
	    op.setOperation(new MultiplyOperation());
	    System.out.println("Result of subtracting: " + op.doOperation(10, 5));

	  
	    op.setOperation(new DivideOperation());
	    System.out.println("Result of dividing: " + op.doOperation(10, 5));
	}


}
