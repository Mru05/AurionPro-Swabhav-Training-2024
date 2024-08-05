package com.techlabs.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer , Integer> Consumer =(Integer n, Integer m ) -> 
		System.out.println("Addition of two number = " +(n+m));
		
		
		Consumer.accept(19, 20);
		

	}

}
