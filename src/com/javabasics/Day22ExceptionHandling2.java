package com.javabasics;

public class Day22ExceptionHandling2 {
	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i <=10; i++) {
		if (i==5) {
				
		throw new Exception();		
			}
			System.out.println(i);
		}
	}

}
