package com.dhanushpractisedall;

public class Edh13_FibonacciNumber {
	public static void main(String[] args) {
		
		
		int f=0;
		int s=1;
		int t=0;
		
		for(int i=1;i<=20;i++) {
			
			t=f+s;                //first +second is equal to third
			f=s;                  //second value becomes first value
			s=t;                  //third value becomes second value
			System.out.println(t);
		}
		
		
	}

}
