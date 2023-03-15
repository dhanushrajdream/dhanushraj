package com.javabasics;

public class Day5PolymorphismMethodoverloadin {
	
	public void studentDetail() {
    System.out.println("sellinium student");
	}
	public void studentDetail(int a) {
	    System.out.println(a);

	}
	public void studentDetail(String name,String course,int register) {
	    System.out.println(name+"  "+course+"     "+register);
	}
	public void studentDetail(int a, int b, int c) {
	    System.out.println(a+" "+b+"  "+c);
	
}   //main method
	public static void main(String[] args) {
		
	//object creation
	Day5PolymorphismMethodoverloadin p = new Day5PolymorphismMethodoverloadin();	
	
	p.studentDetail();
	p.studentDetail(765741);
	p.studentDetail("frank", "story", 100);
	p.studentDetail(500, 501, 1000);
	
	
	}
}
