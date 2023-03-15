package com.sundar;

public class D24_Second_Max_Number {
	
     public static void main(String[] args) {
		
		//method one
		int s[]= {50,20,40,30,10};
		int size=s.length;
		for(int i=0;i<s.length;i++) {//outer loop
			
			for(int j=i+1;j<s.length;j++) {//inner loop
				if(s[i]>s[j]) {//for ascending order
					//(s[i]<s[j])for decending order
					int temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("SECond Max Number "+s[size-2]);
		System.out.println("Third Max Number "+s[size-3]);

}
}
