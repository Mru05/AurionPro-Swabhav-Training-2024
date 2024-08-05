package com.techlabs.model;

public class Employee {
	 private int employeeId;
	    private String name;
	    private double salary;
	   
	    
	    public Employee(int employee,String name, double salary)
	    {
	    	this.employeeId = employee;
	    	this.name = name;
	    	this.salary =salary;
	    }
	    public int getemployeeId(){
	    	return this.employeeId;
	    }
       
        public String getname() {
        	return this.name;
        }
       
        public double getsalary() {
        	return this.salary;
        }
        public void display() {
        	System.out.println();
        }
}
