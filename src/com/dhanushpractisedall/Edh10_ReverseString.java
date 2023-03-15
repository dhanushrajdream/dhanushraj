package com.dhanushpractisedall;

public class Edh10_ReverseString {
	
	
	
	public static void main(String[] args) {
		
		//1.normal way 
		String original  = "naan kadavel";
		String reverse = "";
		for(int i=original.length()-1;i>=0;i--) {
			reverse = reverse+original.charAt(i);
		}
		System.out.println("reverse of string is ="+reverse);
		
		
		//2
        String s="Dhanush";
		
		//method one
		StringBuffer b=new StringBuffer(s);
		System.out.println(b.reverse());
		
		//method two
		StringBuilder c=new StringBuilder(s);
		System.out.println(c.reverse());
		
		//method three
		char d[]=s.toCharArray();//string convert into character, in one array {A,N,B,U}
		String f="";
		for(int i=d.length-1;i>=0;i--) {
			 //-1 is reducing array length for index based(i-- iteration decrease)
			
			f=f+d[i];
		}
		System.out.println(f);

	}
		
		
	}


