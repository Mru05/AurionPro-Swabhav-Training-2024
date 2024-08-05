package comp.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\ADCB\\PROJECTS\\ADCB_CR_BUCKET5_2018\\New folder\\05_stream_app\\testingfile2");
	        FileOutputStream fileOutputStream = new FileOutputStream("D:\\ADCB\\PROJECTS\\ADCB_CR_BUCKET5_2018\\New folder\\05_stream_app\\testingfile");;	
		    int ch;
	        try {
				while((ch =fileInputStream.read())!=-1)
				{
					fileOutputStream.write(ch);
				}
				System.out.println("Copied Successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        int ch;

	}

}
