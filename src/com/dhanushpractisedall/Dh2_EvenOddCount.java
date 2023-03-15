package com.dhanushpractisedall;

import java.util.Scanner;
public class Dh2_EvenOddCount {
	public static void main(String[] args) {
		
		int evencount = 0;  int oddcount = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range of numbers to find the even odd");
		int d = s.nextInt();
		for (int i = 1; i <= d; i++) {
			if (i % 2 == 0) {
				System.out.println("even number" + i);
				evencount+=i;
			} else  {
				System.out.println("odd number is=" + i);
				oddcount+=i;
	}}System.out.println("even count" + evencount);
	  System.out.println("odd count" + oddcount);}}

