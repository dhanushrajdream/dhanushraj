package com.sundar;

import java.util.LinkedHashSet;

public class D26_Remove_Duplicate_In_Array {
	public static void main(String[] args) {
		int[]s= {10,20,10,50,30,20,40,50,80,};
		LinkedHashSet<Integer>a=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			a.add(s[i]);
		}
		System.out.println(a);
		
		
	
	}

}
