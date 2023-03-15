package com.sundar;

public class A8_Reverse_Number {
	
	public static void main(String[] args) {
		int num=123;
		int rev=0;
		while(num>0) {
		
			int n=num%10;
			System.out.println(n);
			rev=(rev*10)+n;
			num=num/10;
			System.out.println(n);
			System.out.println(rev);
			System.out.println(num);
		}
		System.out.println(rev);
	}

}
