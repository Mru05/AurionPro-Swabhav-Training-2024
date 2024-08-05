package com.techlabs.test;

import com.techlabs.model.Employee;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to employee management system");
       
       System.out.println("Enter the number of employees u want to add"); 
       int emp = scanner.nextInt();
        Employee e[]= new Employee[emp];
        for(int i=0;i<e.length;i++) {
        System.out.print("Enter Employee  ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Employee  Name: ");
        String empName = scanner.nextLine();
        
        System.out.print("Enter Employee  Salary: ");
        int empSalary = scanner.nextInt();
        scanner.nextLine(); 
        e[i] = new Employee(empId, empName, empSalary);
        }
        
        for(int i=0;i<e.length;i++) {
        	System.out.println("The employee Details u entered are");
        	System.out.println(e[i]);
        }
        
        
        //Employee employee1 = new Employee(121,"Mru",20000);
        
        
//        System.out.print("Enter Employee 2 ID: ");
//        int emp2Id = scanner.nextInt();
//        scanner.nextLine(); 
//        
//        System.out.print("Enter Employee 2 Name: ");
//        String emp2Name = scanner.nextLine();
//        
//        System.out.print("Enter Employee 2 Salary: ");
//        int emp2Salary = scanner.nextInt();
//        scanner.nextLine(); 
//        
        
//        Employee employee2 = new Employee(122,"MRUNALINI",30000);
//        
//        
//       // scanner.close(); 
//        
//        
//        System.out.println("\nEmployee 1 Details:");
//        System.out.println("ID: " + employee1.getemployeeId());
//        System.out.println("Name: " + employee1.getname());
//        System.out.println("Salary: " + employee1.getsalary());
        
        
//        System.out.println("\nEmployee 2 Details:");
//        System.out.println("ID: " + employee2.getemployeeId());
//        System.out.println("Name: " + employee2.getname());
//        System.out.println("Salary: " + employee2.getsalary());
    }
}
