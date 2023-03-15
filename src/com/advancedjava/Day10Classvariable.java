package com.advancedjava;

public class Day10Classvariable {
	
	int a=22;
	int b=53;
	
	public void add() {
    System.out.println(a);
	}
	public static void main(String[] args) {
		
	Day10Classvariable c = new Day10Classvariable();
	c.add();                    //method level
	System.out.println(c.b);   // variable level
	
	
	}
	

}
