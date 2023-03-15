package com.sundar;

//Edh7
public class D14_Swap_Without_Third_Variable {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=20;
		
		System.out.println("a=  "+a);
		System.out.println("b=  "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a=  "+a);
		System.out.println("b=  "+b);
	}
	

}
