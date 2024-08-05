package comp.techlabs.list;

import java.util.Comparator;

public class ComparatorClass {
	public class NameComparatorForStudent implements Comparator<Student>{

		@Override
		public int compare(Student Student1, Student Student2) {
			// TODO Auto-generated method stub
			return Student1.getName().compareTo(Student2.getName());
			
			}
	}
	public class PercentageComparatorForStudent implements Comparator<Student>{

		@Override
		public int compare(Student Student1, Student Student2) {
			// TODO Auto-generated method stub
			if(Student1.getPercentage()>Student2.getPercentage())
				return 1;
			if(Student1.getPercentage()>Student2.getPercentage())
				return -1;
			return 0;
			
			}
	}
	

}
