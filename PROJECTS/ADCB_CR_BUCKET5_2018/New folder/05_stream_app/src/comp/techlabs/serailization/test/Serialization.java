package comp.techlabs.serailization.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	


	public static class Student implements Serializable{
		
		public int sturollnum;
		public String stuname;
	}
	public static void main(String[] args) {
		// Serialization is process to convert object into byte stream
		//TO IMPLEMENT serialization we need to implement serialized environment
		Student s1 = new Student();
		s1.stuname= "Mrunalini";
		s1.sturollnum = 1;
		String fileName ="D:\\AurionPro\\Serialization.txt";
       
		try {
			FileOutputStream fileoutputstream = new FileOutputStream(fileName);  //Will open this file in write mode
			//i can write data inside this file
			try {
				ObjectOutputStream oos = new  ObjectOutputStream(fileoutputstream);
				oos.writeObject(s1); 
				
				System.out.println("Object file saved  "); //data will be showed in byte code
				//here what we did is created a object and saved it in byte stream which is called as serialization
				//main purpose of this is when we have to store our object 
				//can simply do this by calling writeObject() method
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
