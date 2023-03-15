package com.dhanushpractisedall;

import java.util.Scanner;

public class Dh1_EvenOdd {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the range of numbers to find the even odd");
		int d = s.nextInt();
		for (int i = 1; i <= d; i++) {
			if (i % 2 == 0) {
				System.out.println("even number" + i);
			} else {
				System.out.println("odd number is=" + i);
			}
		}
	}
}
