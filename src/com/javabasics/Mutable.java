package com.javabasics;

public class Mutable {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("dhanush raj");
		System.out.println(System.identityHashCode(sb1));    // new memory created
		
		StringBuffer sb2= new StringBuffer("dhanush raj");
		System.out.println(System.identityHashCode(sb2));
		
		System.out.println(System.identityHashCode(sb1.append(sb2))); // memory created
	}
}
