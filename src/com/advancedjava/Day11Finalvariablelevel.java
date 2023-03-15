package com.advancedjava;

public class Day11Finalvariablelevel {
	
    final double pi=3.14;         //final keyword will not allow to change value
	public void add() {
	   //pi=pi+1;                //trying to change the value(if this line inserted the program will show error)
		System.out.println(pi);
	}
	public static void main(String[] args) {
		Day11Finalvariablelevel g = new Day11Finalvariablelevel();
		g.add();
	}
	

}
