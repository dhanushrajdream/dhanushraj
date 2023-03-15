package com.sundar;

import java.util.TreeSet;

public class D26a_Print_Unique_Number_In_Array {
	public static void main(String[] args) {
	int[]s= {10,20,10,50,30,20,40,50,80,};
	TreeSet<Integer>a=new TreeSet<>();
	for(int i=0;i<s.length;i++) {
		a.add(s[i]);
	}
	System.out.println(a);
	}
}

