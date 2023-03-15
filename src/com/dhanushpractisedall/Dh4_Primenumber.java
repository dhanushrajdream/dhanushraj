package com.dhanushpractisedall;

import java.util.Scanner;

public class Dh4_Primenumber {
	public static void main(String[] args) {

		int count = 0;
		System.out.println("enter a number to find out prime or not");
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		// simple
		for (int i = 2; i <= d / 2; i++) {
			if (d % i == 0) {//number divide by i, if give remainder 0 not prime number
				count++;
			}
		}
		if (count == 0) {// count zero means-not % by any number so PM
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}

}
