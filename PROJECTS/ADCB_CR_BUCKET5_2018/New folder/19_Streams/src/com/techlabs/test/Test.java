package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20, 30, 40, 50);

        // Print all numbers
        System.out.println("All numbers:");
        numbers.forEach(num -> System.out.println(num));

        // Print all odd numbers
        System.out.println("\nAll odd numbers:");
        numbers.stream()
                .filter(num -> num % 2 != 0)
                .forEach(num -> System.out.println(num));

        // Calculate the square of each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        // Print the squared numbers
        System.out.println("\nSquared numbers:");
        squaredNumbers.forEach(num -> System.out.println(num));

        // Calculate the sum of all numbers
        int totalSum = numbers.stream()
                .reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("\nSum of all numbers: " + totalSum);

        // Sort the numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Print the sorted numbers
        System.out.println("\nSorted numbers:");
        sortedNumbers.forEach(num -> System.out.println(num));
        
        //Descending order
        List<Integer> sortedNumbers1 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("\nSorted numbers in decending:");
        sortedNumbers1.forEach(num -> System.out.println(num));
        
        //maximum
       Optional<Integer> max= numbers.stream().max((number2,number3)->number2-number3);
        if(max.isPresent())
        	System.out.println("Max is :"+max.get());
        
        //minimum
        Optional<Integer> min = numbers.stream().min((number1, number2) -> number1 - number2);
        if (min.isPresent()) {
            System.out.println("Minimum number: " + min.get());
        }

        
    }
}












