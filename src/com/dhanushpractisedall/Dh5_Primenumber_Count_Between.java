package com.dhanushpractisedall;

import java.util.Scanner;
public class Dh5_Primenumber_Count_Between {
	public static void main(String[] args) {
        
		int primenumber=0;int nonprime=0;
		System.out.println("enter a number till to find prime or not");
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		// simple
		for (int i = 1; i <= d; i++) {
			int count =0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
    	 }
	}	if (count ==0) {//first for loop
     	System.out.println( i+"=prime number" );primenumber++;		
	} else {
    	System.out.println( i+"=not prime number" );nonprime++;
   }
 }  System.out.println("total prime number"+primenumber);//for loop end
    System.out.println("total non prime number"+nonprime);
}}
