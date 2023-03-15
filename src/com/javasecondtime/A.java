package com.javasecondtime;

public class A {
	static  int a ;
	
	public  void naveen() {
		
		a=12;
		System.out.println(a);

	}
	
	public void dhanush() {
        
		a=15;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		A name = new A();
		
		name.naveen();
		name.dhanush();
		
		System.out.println(a);
		
	}

	public static void increment() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
