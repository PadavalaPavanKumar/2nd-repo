package com.kanerika.test.util;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;
public class CharacterCount {
public static String charRemove(String name,int j) {
		return name.substring(0,j)+name.substring(j+1);
	}
public static void main(String[] args) {
	
	try {
	FileReader fr=new FileReader(new File("String.Input"));
	Properties props=new Properties();
	props.load(fr);
	String name=props.getProperty("Input");
	
	for(int i=0;i<name.length();i++) {
		int count=1;
		for(int j=i+1;j<name.length();j++) {
		int value=	Character.compare(name.charAt(i),name.charAt(j));
		if(value==0) {
			count++;
			name=charRemove(name,j);
		}
		}
		System.out.print(name.charAt(i)+"="+count+" ");
	}
	}catch(Exception e) {
		
	}
}
}
