package com.sundar;

public class D18_String_Reverse {
	
	public static void main(String[] args) {
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
