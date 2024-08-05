package comp.techlabs.list.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import comp.techlabs.list.Employee;
import comp.techlabs.list.EmployeeComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee= new ArrayList<Employee>();
		employee.add(new Employee(1,"Mrunalini",20000.0));
		employee.add(new Employee(2,"Neha",33000.0));
		employee.add(new Employee(1,"Yash",50000.0));
		employee.add(new Employee(1,"Smoky",45000.0));
		
		System.out.println("New sort according to names");
		Collections.sort(employee, new EmployeeComparator.NameComparatorForEmployee());
		 for (Employee employee1 : employee) {
	            System.out.println(employee1);
	        }
		 
		 System.out.println("Sorted according to ID");
		 //Collections.sort(employee, new EmployeeComparator.EmployeeIdComparator());
		 for (Employee employee1 : employee) {
	            System.out.println(employee1);
	        }
		 
		 
		 
		 
		

	}

}
