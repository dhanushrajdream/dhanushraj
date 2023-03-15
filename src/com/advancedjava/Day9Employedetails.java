package com.advancedjava;

public class Day9Employedetails {
	
	//parameterized
	public Day9Employedetails(String name) {
	    System.out.println(name);
	}
	public Day9Employedetails(int rollnumber) {
	    System.out.println(rollnumber);
	}
	public Day9Employedetails(float sponsor) {
	    System.out.println(sponsor);
	    
	}//non-parameterized
	public Day9Employedetails() {
    System.out.println(800);
	}
	public static void main(String[] args) {
		
    Day9Employedetails e = new Day9Employedetails("jayant");
    Day9Employedetails e1 = new Day9Employedetails(35);
    Day9Employedetails e2 = new Day9Employedetails(900);
    Day9Employedetails e3 = new Day9Employedetails(1000);
	
	
	
}
}
