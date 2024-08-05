
package com.techlabs.model;

public class Student {
	private  IStudentService studentService;
	public Student(IStudentService studentservice) {
		// TODO Auto-generated constructor stub
		this.studentService= studentservice;
	}
	public double calculatePercentage() {
		return (studentService.getmarks()/studentService.getnumberofsubject());
	}

}
