package com.sundar;

public class D19_Palindrome_Of_String {
	
	public static void main(String[] args) {
		String s="malayalam";
		char d[]=s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+d[i];
		}
			System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
	}

}
