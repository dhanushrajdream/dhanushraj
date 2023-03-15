package com.advancedjava;

public class Interface2 implements Interface{
	
	@Override
	public void employeeName() {
    System.out.println("dhanush kodi");		
	}
	@Override
	public void employeAdderes() {
    System.out.println("MA chidambaram nagar");
	}
	@Override
	public void employeSalary() {
	System.out.println("70k");
		
	}
	@Override
	public void employeeGirlfriend() {
    System.out.println("vaipu illa raja ");
	}
	// main method
	public static void main(String[] args) {
	//object creation
	Interface2 zerobalance = new Interface2();
	zerobalance.employeeName();
	zerobalance.employeAdderes();
	zerobalance.employeSalary();
	zerobalance.employeeGirlfriend();
	}

}
