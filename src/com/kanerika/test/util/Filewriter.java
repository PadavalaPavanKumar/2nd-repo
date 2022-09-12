package com.kanerika.test.util;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("C:\\\\Users\\\\Admin\\\\Documents\\\\New folder\\\\Programs\\\\src/Abstract.java");
			file.write("end of programs.how are you guys");
			file.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
