package com.kanerika.test;
import com.kanerika.test.util.Array;
import java.util.*;
public class ArrayTest {
	
	  	public static void main(String[] args) {
	  		Scanner sc = new Scanner(System.in);
	  		System.out.println("enter a string:");
	  		String s = sc.nextLine();
	  		input(s);
	  	}

	  	static void input(String s) {
	  		String[] a = s.split(",");
	  		
	  		int[] i = new int[a.length];
	  		for (int i1=0;i1<a.length;i1++) {
	  			
	  			i[i1] = Integer.valueOf(a[i1]);
	  		}
	  		
	  			 Array.multiply(i);
	  			
	  		}
	  		
	  
	  	}
	  
	

