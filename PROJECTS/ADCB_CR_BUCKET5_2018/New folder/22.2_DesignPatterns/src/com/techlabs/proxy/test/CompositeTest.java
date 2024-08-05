package com.techlabs.proxy.test;

import com.techlabs.proxy.model.Department;
import com.techlabs.proxy.model.FinancialDepartment;
import com.techlabs.proxy.model.HeadDepartment;
import com.techlabs.proxy.model.SalesDepartment;

public class CompositeTest {
	public static void main(String[] args) {
		//SpringApplication.run(CompositeApplication.class, args);
		Department salesDepartment = new SalesDepartment(
				1, "Sales department");
		Department financialDepartment = new FinancialDepartment(
				2, "Financial department");

		HeadDepartment headDepartment = new HeadDepartment(
				3, "Head department");

		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);

		headDepartment.printDepartmentName();
	}	

}
