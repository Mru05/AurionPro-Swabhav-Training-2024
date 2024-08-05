package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
	AreaCalculator calculator;
	
	@BeforeEach
	void intit() {
		calculator = new AreaCalculator();	
	}
	@AfterEach
	void status() {
		System.out.println("Successfully executed");
	}
	@Test
	void testCalculatorAreaOfCircle(){
		assertEquals(78.5,calculator.calculatorAreaofCircle(5),"This function must do addition");
	}
	@Test
	void testCalculatorAreaOfRectangle(){
		assertEquals(25,calculator.calculatorAreaofRectangle(5, 5));
	}
	@Test
	void testCalculatorAreaOfTriangle(){
		assertEquals(4, calculator.calculatorAreaofTriangle(4, 2));
	}
}
