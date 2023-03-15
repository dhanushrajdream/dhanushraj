package com.dhanushpractisedall;

import java.util.Scanner;

public class Edh12_PalindromeNumber {
	
	public static void main(String[] args) {
		
		//1.to find number is palindrome or not
		System.out.println("enter a number to find palinrome or not");
		Scanner s = new Scanner(System.in);
	    int no = s.nextInt();
		int no2=0,pal=0,i=0;
		
		no2=no;
		while(no>0) {
			
			i=no%10;         
			pal=(pal*10)+i; 
			no=no/10;         
				
		}if(no2==pal) {
			System.out.println("palindrome"+pal);	
		}else {
			System.out.println("not palindrome"+pal);	
		}
	}
	
	
	
	

}
