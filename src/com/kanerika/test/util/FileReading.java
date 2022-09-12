package com.kanerika.test.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReading  {
    public static void main(String[] args) {
    	try {
		File obj=new File("C:\\Users\\Admin\\Documents\\New folder\\Programs\\src/Abstract");
		Scanner s=new Scanner(obj);
		while(s.hasNextLine()) {
			String data=s.nextLine();
			System.out.println(data);
		}
		s.close();
	}
    	catch(FileNotFoundException e) {
    		System.out.println("Hello");
    	}
    }
}
