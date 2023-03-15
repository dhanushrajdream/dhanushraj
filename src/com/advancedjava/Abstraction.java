package com.advancedjava;

public abstract class Abstraction {
	//non abstract method
	public void accountNumber() {
    System.out.println("6601092146");
	}
	public void acountHolderName() {
		System.out.println("subi axis bank");

	}
	//abstract method (no body use)
	
	public abstract void pinNo();
	
	//no implementation part only signature part
}


//abstractiom__>hiding unnecessary details from user