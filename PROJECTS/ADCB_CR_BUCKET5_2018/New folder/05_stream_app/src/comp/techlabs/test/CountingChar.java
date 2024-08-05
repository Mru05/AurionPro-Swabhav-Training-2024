package comp.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountingChar {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\ADCB\\PROJECTS\\ADCB_CR_BUCKET5_2018\\New folder\\05_stream_app\\testingfile");
            int ch;
            int charCount = 0;
            int lineCount = 0;
            int spaceCount = 0;

            try {
                while ((ch = fileInputStream.read()) != -1) {
                    System.out.print((char) ch);
                    charCount++;
                    if (ch == '\n') {
                        lineCount++;
                    }
                    if (ch == ' ') {
                        spaceCount++;
                    }
                }
                // If the file does not end with a newline, count the last line
                if (charCount > 0 && ch != '\n') {
                    lineCount++;
                }

                System.out.println("\nTotal number of characters: " + charCount);
                System.out.println("Total number of lines: " + lineCount);
                System.out.println("Total number of spaces: " + spaceCount);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
