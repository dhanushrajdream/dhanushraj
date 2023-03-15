package com.sundar;

public class D33_Count_AllCaps_Small_Digits_Special_Withoutspecialmethod {
	public static void main(String[] args) {
		String s="asdfghjknjuyggngggDFGHJKIUJKHHYUI12456789@#$%^&*()";
		char c[]=s.toCharArray();
		int sm=0;
		int ca=0;
		int d=0;
		int sp=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&& c[i]<='z') {
				sm=sm+1;
			}
			else if(c[i]>='A' && c[i]<='Z') {
				ca=ca+1;
			}
			else if(Character.isDigit(c[i])) {
				d=d+1;
			}
			else {
				sp=sp+1;
			}
				
	}
		System.out.println(sm);
		System.out.println(ca);
		System.out.println(d);
		System.out.println(sp);
	}
}
