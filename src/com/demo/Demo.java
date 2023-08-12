package com.demo;

public class Demo {
	int y=25;
 	
	public static void main(String[] args) {
     	   int x=50;
		
		System.out.println("First letter of my name=A");
		
		System.out.println("Local variable is x="+x);

		Demo assigment = new Demo();
		System.out.println(assigment.y);
	}

}
