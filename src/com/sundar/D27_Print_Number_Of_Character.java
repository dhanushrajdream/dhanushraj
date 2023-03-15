package com.sundar;

public class D27_Print_Number_Of_Character {
	
	public static void main(String[] args) {
		
		//print number of character
		String d="dhnauhsrajdream%%%@gmail.com";
		
		char c[] = d.toCharArray(); 
		//split into single single character and print the length
		System.out.println("number of character=="+c.length);
		
		//second form
		System.out.println((d.toCharArray()).length);
		
		
		//print number of words
		String e="Welcome@to@the@magic@world";
		String g[]=e.split("@");
		System.out.println("Number of words "+g.length);
	}

}
