package com.kanerika.test.util;
import java.util.Scanner;

public class LetterCombinations {
	public void letterCombination(String num) {
		String[] aa = num.split("");
	  		
	  		int[] i11 = new int[aa.length];
	  		for (int i1=0;i1<aa.length;i1++) {
	  			
	  			i11[i1] = Integer.valueOf(aa[i1]);
    String[] phoneNumbers = {"" ,"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};		   
      
          String s=phoneNumbers[i11[0]];
         
          char a=1,b=1;
          int n=s.length();
        String s1=  phoneNumbers[i11[1]];
        int n1=s1.length();
        String[] ss2=new String[n*n1];
        String ss1=" ";String ss=" ";
        int z=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n1;j++) {
        		 a=s.charAt(i) ;b=s1.charAt(j);
        		 ss=Character.toString(a);
        	 ss1=Character.toString(b);
        	 ss2[z++]=ss+ss1;
        	}
        }
       for(int i=0;i<ss2.length;i++) {
    	   System.out.print( ss2[i]+" ");
       }
        
}}}
       

