package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
    Operations operation;

    @BeforeEach
    void init() {
        operation = new Operations();
    }

    @AfterEach
    void status() {
        System.out.println("Test executed");
    }

    @Test
    void testAddition() {
        assertEquals(6, operation.addition(2, 4), "This function must do addition");
    }

    @Test
    void testSubtraction() {
        assertEquals(6, operation.subration(10, 4), "This function must do subtraction");
        assertEquals(1, operation.subration(3, 2), "This function must do subtraction");
    }

    @Test
    void testDivision() {
        assertEquals(3, operation.division(6, 2), "This function must do division");
        
        assertThrows(ArithmeticException.class, () -> operation.division(6, 0));
    }

    @Test
    void testMultiplication() {
        assertEquals(8, operation.multiplication(2, 4), "This function must do multiplication");
    }
}
