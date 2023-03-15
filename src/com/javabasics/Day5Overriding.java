package com.javabasics;

public class Day5Overriding extends Day5Method {
	
	public void studentName(String name) {
	super.studentName(name);
    
	}
	public void studentId(int attitude) {
    super.studentId(attitude);
	}
    public static void main(String[] args) {
		//object creation
    	
    	Day5Overriding m = new Day5Overriding();
    	
    	//method calling
    	m.studentName("magesh");
    	m.studentId(92);
	}
	}


