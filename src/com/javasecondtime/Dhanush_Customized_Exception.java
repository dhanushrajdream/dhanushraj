package com.javasecondtime;

public class Dhanush_Customized_Exception {

	// this class is linked with DhanushException class

	public static void arithmeticCalculation(int a, int b) throws Exception {

		try {
			System.out.println(a / b);

		} catch (Exception e) {

			// throw new DhanushException(); //for non parameterized constructor(44)
			                                 // parameterized constructor(55)
			throw new DhanushException(
					"If you give parametrized constructor(in" 
			      + " DhanushException class) = u can print here it self");
		}

	}

	public static void main(String[] args) throws Exception {

		arithmeticCalculation(10, 0); // calling the method

	}

}
