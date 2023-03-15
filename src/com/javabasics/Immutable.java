package com.javabasics;

public class Immutable {
	public static void main(String[] args) {
		
		String s1="senthil";
		System.out.println(System.identityHashCode(s1));
		
		String s2 ="senthil";
		System.out.println(System.identityHashCode(s2)); //memory shared
		
	   System.out.println(System.identityHashCode(s1+s2));  //memory created

	
	
	
	
	
	}

}
