package com.sundar;

public class D35_EachWord_FirstLetter_Caps {
	public static void main(String[] args) {
		String s="welcome to jurrasic park";
		String f="";
		String h="";
		String[] c=s.split(" ");
		for(int i=0;i<c.length;i++) {
			char ch=c[i].charAt(0);
			String g=ch+f;
			String a=g.toUpperCase();
			h=h+a+c[i].substring(1)+" ";
		}
		System.out.println(h);
	}

}
