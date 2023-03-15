package com.advancedjava;

public class Day11Finaliseee2 extends Day11Finaliseee{
	int a=20;
	public void add() {
    System.out.println(this.a);
    System.out.println(super.a);
	}
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		Day11Finaliseee2 s = new Day11Finaliseee2();
	s.finalize();
	
	
	
    
    
    }
}
