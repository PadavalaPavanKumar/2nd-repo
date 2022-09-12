package com.kanerika.test.util;

public class UnicodeValue {
   
   public void stringArray(String name) {
    	    String name2= name.replaceAll(",","");
    	char[] c=name2.toCharArray();
    	for(char c1:c) {
    		System.out.print((int) c1+" ");
    	}
    	}
    	
    }

