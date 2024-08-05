package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter voter = null;
		try {
			
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter voter id : ");
        int voterId = scanner.nextInt();
        System.out.println("Enter first name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        voter = new Voter(voterId, firstName, lastName, age );
        throw new AgeNotValidException(age);
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e.getMessage());
		}
	       System.out.println(voter);
		
		
	}

}
