package com.sundar;

public class D36_Reverse_Each_Word_In_String {
	public static void main(String[] args) {
		String s="welcome to jurrasic park";
		String h="";
		char e[]=s.toCharArray();
		for(int i=e.length-1;i>=0;i--) {
			h=h+e[i];
		}
		System.out.println(h);
		
	}

}
