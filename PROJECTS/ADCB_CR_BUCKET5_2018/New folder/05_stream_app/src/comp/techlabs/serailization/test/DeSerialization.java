package comp.techlabs.serailization.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerialization {

    public static class Student implements Serializable {
        public int sturollnum;
        public String stuname;
    }

    public static void main(String[] args) {
        String fileName = "D:\\AurionPro\\Serialization.txt";

        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student obj = (Student) ois.readObject(); // Type casting to Student
            System.out.println("Student Name: " + obj.stuname);
            System.out.println("Student Roll Number: " + obj.sturollnum);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
