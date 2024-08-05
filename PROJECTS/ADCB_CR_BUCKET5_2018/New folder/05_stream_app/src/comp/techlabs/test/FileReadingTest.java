package comp.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\ADCB\\PROJECTS\\ADCB_CR_BUCKET5_2018\\New folder\\05_stream_app\\testingfile");
            int ch;
            
            while ((ch = fileInputStream.read()) != -1) {
                System.out.print((char) ch);
            }
            
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
