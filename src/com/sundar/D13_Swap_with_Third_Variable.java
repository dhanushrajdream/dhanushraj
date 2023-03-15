package com.sundar;

//Edh6
public class D13_Swap_with_Third_Variable {
	
	public static void main(String[] args) {
		
		/*once upon time there was three pencil --a,b,c--c stole pencil from a
		a stole pencil from b
		b stole pencil from c
		*/
		int a=13;
		int b=35;
		int temp;
		
		System.out.println("a=  "+a);
		System.out.println("b=  "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a=  "+a);
		System.out.println("b=  "+b);
	}

}
