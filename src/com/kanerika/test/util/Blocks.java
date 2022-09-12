package com.kanerika.test.util;
 
class Blocks1{
	public Blocks1() {
		// TODO Auto-generated constructor stub
		System.out.println("super class");
	}
}

public class Blocks extends Blocks1{
	
	public  Blocks(){
		super();
    	System.out.println("non argument default constructor is called");
    }
   public Blocks(int age,String name){
	   
    	System.out.println("my name is"+name+"my age is"+age);
    }
	{
	System.out.println("Instance block is called");
	}
    public void instanceMethod() {
    	System.out.println("Instance method is called");
    }
    static {
		System.out.println("static block is called");
	}
	public static void staticMethod() {
		System.out.println("static method is called");
	}
}
