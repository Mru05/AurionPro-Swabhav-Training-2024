package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter roll number of student : ");
		int r = scn.nextInt();
		System.out.println("Enter name of student : ");
		String n = scn.next();
		System.out.println("Enter age of student : ");
		int a = scn.nextInt();
		System.out.println("Enter percentage of student : ");
		double d = scn.nextDouble();
		
		System.out.println("Name of student = "+s.getname());
		System.out.println("Age of student = "+s.getage());
		System.out.println("Roll Number of student = "+s.getrollnum());
		System.out.println("Enter percentage = "+s.getpercentage());

	}

}
