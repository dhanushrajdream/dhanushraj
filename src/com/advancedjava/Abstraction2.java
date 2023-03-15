package com.advancedjava;

public class Abstraction2 extends Abstraction {
	
	
	@Override
	public void pinNo() {
    System.out.println(3424);
    
	}// main method
	public static void main(String[] args) {
	// object creation
	Abstraction2 poda = new Abstraction2();	
	// method calling
	poda.accountNumber();
	poda.acountHolderName();
	poda.pinNo();
	
	
	}
	
	

}
