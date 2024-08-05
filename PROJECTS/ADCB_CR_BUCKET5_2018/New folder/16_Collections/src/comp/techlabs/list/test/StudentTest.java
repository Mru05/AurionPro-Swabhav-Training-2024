package comp.techlabs.list.test;

import java.util.ArrayList;
import java.util.Scanner;

class StudentTest {
    String name;
    double percentage;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();

        ArrayList<StudentTest> students = new ArrayList<>();

        readStudents(sc, students); // Call the method to read student details

        System.out.println("Student details entered:");
        studentdetails(students); // Call the method to display student details

        sc.close();
    }

    public StudentTest(String name, double marks) {
        this.name = name;
        this.percentage = marks;
    }

    private static void readStudents(Scanner sc, ArrayList<StudentTest> students) {
        System.out.println("Enter the names and marks of " + students.size() + " students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            String name = sc.next();
            System.out.print("Student " + (i + 1) + " percentage: ");
            double marks = sc.nextDouble();
            students.add(new StudentTest(name, marks)); // Create a new StudentTest object with name and marks
        }
    }

    private static void studentdetails(ArrayList<StudentTest> students) {
        for (StudentTest student : students) {
            System.out.println("Name: " + student.name + ", Marks: " + student.percentage);
        }
    }
}
