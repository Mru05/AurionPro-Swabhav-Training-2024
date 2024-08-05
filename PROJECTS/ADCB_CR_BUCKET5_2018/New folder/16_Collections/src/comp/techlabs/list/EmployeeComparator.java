package comp.techlabs.list;
import comp.techlabs.list.Employee;
import java.util.Comparator;

public class EmployeeComparator {
	public static class NameComparatorForEmployee implements Comparator<Employee>{


		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
	public class EmployeeIdComparator implements Comparator<Employee>{
			
			

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub

			if(o1.getEmployeeId()>o2.getEmployeeId())
				return 1;
			if(o1.getEmployeeId()>o2.getEmployeeId())
				return -1;
			return 0;
		}
	}
	
	public class salary implements Comparator<Employee>{
		
		

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub

			if(o1.getSalary()>o2.getSalary())
				return 1;
			if(o1.getSalary()>o2.getSalary())
				return -1;
			return 0;
		}
	}
	

}
