package com.techlabs.test;

import java.util.function.Consumer;

public class Factorial {

    public static void main(String[] args) {
       
        Consumer<Integer> factorialConsumer = (Integer number) -> {
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + number + " = " + fact);
        };

       
        factorialConsumer.accept(6);
    }
}
