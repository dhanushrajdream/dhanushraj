package com.dhanushpractisedall;

public class Edh14_SpecialCharacter {
	
	
	public static void main(String[] args) {
		
		//without special methods
		
		String s="asdfghjknjuyggngggDFGHJKIUJKHHYUI12456789@#$%^&*()";
		char c[]=s.toCharArray();
		int sm=0;
		int ca=0;
		int d=0;
		int sp=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&& c[i]<='z') {
				sm=sm+1;
			}
			else if(c[i]>='A' && c[i]<='Z') {
				ca=ca+1;
			}
			else if(Character.isDigit(c[i])) {
				d=d+1;
			}
			else {
				sp=sp+1;
			}
				
	}
		System.out.println(sm);
		System.out.println(ca);
		System.out.println(d);
		System.out.println(sp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//special character count
		int lowercase =0,uppercase=0,digit=0,specialcharacter =0;
		
		String s2 ="WelCOme TO indiA MY friend @134567^$**%";
		for(int i=0;i<s2.length()-1;i++) {
			char ch=s2.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				uppercase++;
			}else if (Character.isLowerCase(ch)) {
				lowercase++;
			}else if (Character.isDigit(ch)) {
				digit++;
			}else {
				specialcharacter++;
			
			}
		}
		System.out.println(uppercase);
		System.out.println(lowercase);
		System.out.println(digit);
		System.out.println(specialcharacter);
		
		
	}

}
