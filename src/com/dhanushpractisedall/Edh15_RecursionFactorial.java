package com.dhanushpractisedall;

public class Edh15_RecursionFactorial {
	
	
	 public static int fact(int no) {
		if(no==0) 
		        return 1; //if fact = 0 it will return 1value to stop the loop
		        return no*fact(no-1);  //5*fact(4-1)
		

	}
	
	public static void main(String[] args) {
		System.out.println("enter a number to find out factorial");
		
		
		int no=5;
		System.out.println(fact(no)); 
		
		
		
		
		//method 2 using forloop
		
		int a=5;
		int fact=1;
		
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println("total= "+fact);
		
	    //-----

		
		
	}

	

}
