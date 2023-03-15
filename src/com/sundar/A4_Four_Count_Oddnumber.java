package com.sundar;

public class A4_Four_Count_Oddnumber {
	
public static void main(String[] args) {
	
	int count=0;
	
	for (int i = 1; i <=200 ; i++) {
		
		if (i%2!=0) {
			count++;
		}	
	}
	System.out.println("total count"+count);
}	

}
