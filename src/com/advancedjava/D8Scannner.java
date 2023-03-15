package com.advancedjava;

import java.util.Scanner;

public class D8Scannner {
	//main method
	public static void main(String[] args) {
		
	//object creation
	
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("enter your system name: ");
	String name = s.nextLine();
	System.out.println(name);
	
	System.out.println("enter your system price:");
	int price = s.nextInt();
	System.out.println(price);
	

	
	}	

}
