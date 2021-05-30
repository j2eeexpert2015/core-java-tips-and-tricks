package corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) throws IOException {
		String fileLocation="C:\\test\\sample.txt";
		FileReader file = new FileReader(fileLocation);
        BufferedReader fileInput = new BufferedReader(file);
        String line = fileInput.readLine();
        while(line!=null) 
        {
        	line = fileInput.readLine();
        	System.out.println(line);
        }
          
        fileInput.close();
	}

}
