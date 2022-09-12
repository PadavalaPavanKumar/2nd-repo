package com.kanerika.test;
import com.kanerika.test.util.*;
import java.util.Scanner;

public class LetterCombinationTest {
	 public static void main(String[] args) {
  	   Scanner sc=new Scanner(System.in);
  	   System.out.println("numbers:");
  	   String num=sc.nextLine();
  		
  	  		LetterCombinations lettercom=new LetterCombinations();
  	  		lettercom.letterCombination(num);
  	  		}
}