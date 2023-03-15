package com.sundar;

public class D30_Print_Vowel_Types_Count {
	
	public static void main(String[] args) {
		String s="tho love and thunder thor raganarok thor one thor two dark world ie";
		char c[]=s.toCharArray();
		int aa=0;
		int ee=0;
		int ii=0;
		int oo=0;
		int uu=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a') {
				aa=aa+1;
			}
			else if(c[i]=='e') {
				ee=ee+1;
			}
			else if(c[i]=='i') {
				ii=ii+1;
			}
			else if(c[i]=='o') {
				oo=oo+1;
			}
			else if(c[i]=='u') {
				uu=uu+1;
			}
		}
		System.out.println("vowel a count ="+aa);
		System.out.println("vowel e count ="+ee);
		System.out.println("vowel i count ="+ii);
		System.out.println("vowel o count ="+oo);
		System.out.println("vowel u count ="+uu);
	}

}
