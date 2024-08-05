package comp.techlabs.list;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<Student>();
		
		students.add(new Student(1,"Mru",90));
		students.add(new Student(4,"Neha",56));
		students.add(new Student(2,"Yash",85));
		students.add(new Student(3,"Smoky",98));
		
		System.out.println("Student not Sorted are : ");
		for(Student student : students)
			{System.out.print(students);
		break;
			}
		
		System.out.println("New according to names");
		Collections.sort(students, new NameComparatorForStudent());
		 for (Student student : students) {
	            System.out.println(student);
	        }
		
	
	}
	

}
