package com.dhanushpractisedall;

import java.util.Scanner;

public class Dh9_ArmstrongNumber {
	
	public static void main(String[] args) {
		
		//this program works for 3 digit numbers only
		System.out.println("enter a number to find out armstrong or not");
		
		Scanner s = new Scanner (System.in);
		int no = s.nextInt(); //intial value
		
		int no2;
		
		no2=no;    //after executing no(number) will change so only starting its we assign value in another variable -no2;
		int arm=0; //armstrong
		int rem=0; //remainder
		
		while(no>0){           //cycle continue till it reaches 0
		rem=no%10;             //here u get a remainder
		arm=arm+(rem*rem*rem); //that remainder 3 time multiplied
		no=no/10;              //one digit removed 
		
	    }
		
		if(no2==arm) {
			System.out.println("its armstrong="+arm);
			
		}else {
			System.out.println("it not armstrong="+arm);
		}
		
		
		
	}

}
