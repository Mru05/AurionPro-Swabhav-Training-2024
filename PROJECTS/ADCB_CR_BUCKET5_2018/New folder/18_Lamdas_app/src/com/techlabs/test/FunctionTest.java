package com.techlabs.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Function<Integer , Integer> squareFunction =(number) -> number*number;
     
     System.out.println(squareFunction.apply(5));
	}

}
