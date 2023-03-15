package com.sundar;

public class D25_Third_Minimum_Number {
	public static void main(String[] args) {
	
	int s[]= {50,20,40,30,10};
	int size=s.length;
	for(int i=0;i<s.length;i++) {//outer loop
		
		for(int j=i+1;j<s.length;j++) {//inner loop
			if  (s[i]<s[j]) { //(s[i]>s[j])for ascending order
				                //for descending order
				int temp=s[i];
				s[i]=s[j];
				s[j]=temp;
				
			}
		}
	}
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
	System.out.println("third Min Number "+s[size-3]);
	}
}
