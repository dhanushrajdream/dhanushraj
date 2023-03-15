package com.dhanushpractisedall;

import java.util.Scanner;

public class Dh8_ReverseNumber {
	
	
	public static void main(String[] args) {
		
		System.out.println("enter a number to find the reverse of the number");
		
		int no =153;
		
		
		int no2=0;                     // (no2 = no) if equal then its a palindrome
		int rem=0;
		
		while (no>0) {                //loop will break if value is equal to 0 
		    
			rem=(rem*10)+no%10;       //0=(0*10)+1234%10 => rem=4 (next time remainder 0 will change to 4
			 no=no/10;                //no=1234 will reduce one digit now no=123 (will reduce till 0)  

		}
		System.out.println(rem);

	}

}
