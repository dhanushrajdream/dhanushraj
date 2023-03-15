package com.sundar;

public class A6_Sum_Even {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i = 1; i <=90; i++) {
			
			if (i%2==0) {
				sum=sum+i;
				System.out.println(i);
			}
			
		}
		System.out.println("total sum "+sum);
		
	}

}
