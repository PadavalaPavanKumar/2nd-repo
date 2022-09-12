package com.kanerika.test.util;

public class ArithemticOperationUtil {
	
	public void performAdd(int[] values) {
		if(values.length<=1) 
			System.out.println("Can't perform add with 0/1 value");
		else {
			int count = 0;
			for(int value : values) {
				count = count + value;
			}
			System.out.println(count);
		}
	
	}
}
