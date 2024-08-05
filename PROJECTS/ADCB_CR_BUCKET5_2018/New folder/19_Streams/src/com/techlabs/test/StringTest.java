package com.techlabs.test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> names= Arrays.asList("Mrunalini","Sanjay","Shivam","Neha","Yash");
       List<String> sortednames = names.stream().sorted().collect(Collectors.toList());
       
       System.out.println("\nSorted names in decending:");
       System.out.println(sortednames);
    		


       List<String> sortedNames = names.stream()
               .filter(name -> name.contains("a"))
               .sorted()
               .limit(3)
               .collect(Collectors.toList());

       // Print the sorted names
       System.out.println("Sorted names containing 'a':");
       sortedNames.forEach(System.out::println);
       
       //names in descending order 
       List<String> sortedNames1 = names.stream()

               .sorted((name1, name2) -> name2.compareTo(name1))
               
               .collect(Collectors.toList());

       // Print the sorted names
       System.out.println("Sorted names in descending order):");
       sortedNames1.forEach(System.out::println);
       
       
       //first 3 characters
       List<String> names1 = Arrays.asList("Mrunalini", "Sanjay", "Shivam", "Neha", "Yash");
       System.out.println("First 3 char");
       names1.forEach(name -> System.out.println(name.substring(0, Math.min(3, name.length()))));
       System.out.println("First 3 char"+names1);
       
       //names of the students that contains less than or equal to 4 characters
       List<String> shortNames = names.stream()
    	        .filter(name -> name.length() <= 4)
    	        .collect(Collectors.toList());
    	System.out.println("Short names 4 or less than 4 characters):");
    	shortNames.forEach(System.out::println);

       

        
       
       
       
       
       
       
	}

}
