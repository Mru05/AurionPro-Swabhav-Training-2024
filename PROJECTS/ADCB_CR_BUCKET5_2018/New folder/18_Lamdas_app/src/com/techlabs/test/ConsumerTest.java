package com.techlabs.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = (Integer number)->
			
			System.out.println("Square of number = "+number*number);
		
			consumer.accept(6);

	}

}
