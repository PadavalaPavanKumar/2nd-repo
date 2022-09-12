package com.kanerika.test.util;
import java.io.File;
import java.io.IOException;
public class CreateingFile {
  public static void main(String[] args) {
	try {
		File newFile=new File("MyNewFile");
		if(newFile.createNewFile()) {
			System.out.println("new file has been created"+newFile.getName());
		}else {
			System.out.println("file has been already created");
		}
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
