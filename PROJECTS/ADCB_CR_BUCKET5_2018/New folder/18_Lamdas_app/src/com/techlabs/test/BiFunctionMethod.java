package com.techlabs.test;
import java.util.function.BiFunction;
public class BiFunctionMethod {

    public static void main(String[] args) {
    	BiFunction<Integer, Integer, Integer> biFunction = (Integer number1, Integer number2) -> number1 + number2;
        //int result = biFunction.apply(5, 3);
        System.out.println("Result of the BiFunction: " + biFunction.apply(5, 3));
    }
}
