package com.javasecondtime;

public class Abstracttion_1b extends Abstracttion_1a {

	@Override
	
	void employeeId() {
		 System.out.println("5555");
	}

	@Override
	void employeeName() {
		System.out.println("dhanush");
	}

	@Override
	void employeeSalary() {
		System.out.println("55000");
	}

	@Override
	void employeeAddress() {
		System.out.println("no11,thirumoorthy nagar,madhananthapuram,chennai 600125");
		
	}
	
	public static void main(String[] args) {
		
		Abstracttion_1b name = new Abstracttion_1b();
		
		name.employeeId();
		name.employeeName();
		name.employeeSalary();
		name.employeeAddress();
	
	}

}
