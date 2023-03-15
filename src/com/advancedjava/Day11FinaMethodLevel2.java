package com.advancedjava;

public class Day11FinaMethodLevel2 extends Day11FinaMethodlevel{
	
	@Override 
	public final void dogPhysical() {                    //trying to add extra details but final keyword in method will not allow
    super.dogPhysical();                           //thats why we use final keyword
    System.out.println("sound bhow bhow");
	}
	public static void main(String[] args) {
		
	Day11FinaMethodLevel2 gg = new Day11FinaMethodLevel2();	
	gg.dogPhysical();
	
	}

}
