package com.javabasics;

public class Day16StringProgram {
	
	
	public static void main(String[] args) {
		String s="Welcome to java";
		String s1= "welcome@to@java";
		String s2="  ";
		String s3="null";
		String s4= "";
		String s5= " hello world ";
		
		int length = s.length();
	    System.out.println(length);
	     
	    boolean equals = s.equals(s1);
	    System.out.println(equals);
	    
	    boolean equalsIgnorecase =s.equalsIgnoreCase(s1);
	    System.out.println(equalsIgnorecase);
	    
	    String uppercase = s.toUpperCase();
	    System.out.println(uppercase);
	    
	    String lowercase = s.toLowerCase();
	    System.out.println(lowercase);
	    
	    boolean startswith = s.startsWith("welcome");
	    System.out.println(startswith);
	    
	    boolean contains =s1.contains("w");
	    System.out.println(contains);
	    boolean endswith = s.endsWith("va");
	    System.out.println(endswith);
	    int indexof = s1.indexOf("c");
	    System.out.println(indexof);
	    int lastindexof = s1.lastIndexOf("a");
	    System.out.println(lastindexof);
	    
	    char charat =s1.charAt(5);
	    System.out.println(charat);
        
	    String replace =s1.replace("java","jurassic park");
	    System.out.println(replace);
	    
	    String substring =s1.substring(3);
	    System.out.println(substring);
	    
	    boolean empty = s4.isEmpty();
	    System.out.println(empty);
	    
	    System.out.println("trimmmmmmmmmmmmmmm");
	    String trim = s5.trim();
	    System.out.println(trim);
	    
	    String[] split=s1.split("@");//$@#&,space,%
	    for (String string : split) {
			System.out.println(string);
		}
	    
	    
	    
	    
	
		
	}

}
