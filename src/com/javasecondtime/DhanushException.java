package com.javasecondtime;

public class DhanushException extends Exception { //only extended to exception is condsidered as exception

	public DhanushException() {   //non parameterized constructor(44)

		System.out.println("kanna tharanthu value adi = B value cannot be zero  ");

	}
	
	public DhanushException(String s) {   //parameterized constructor(55)

		System.out.println(s);   //value is there where just printing here(can be used versatile)
	}
	

	// public static void main(String[] args) {
	// DhanushException refname /* 1 */= new DhanushException();
	// {1}left side is class name(DhanushException)
	// right side we have created new memory and assigned it to left side (class
	// name)
	// middle one is just reference varaiblename
	// in here we created object and assigned left side to right side 
	// }

}
