package com.sundar;

import java.util.ArrayList;
import java.util.Collections;

public class D22_Find_MaxValue_In_Array {
	public static void main(String[] args) {
		int s[]= {50,20,80,30,10};
		int max=0;//s[0] assuming any index so not problem
		for(int i=0;i<s.length;i++) {
			if(s[i]>max) { //to find maximum number
				//(s[i]<max)-to find minimum number
				max=s[i];
				
			}
		}
		System.out.println(max);
		
		System.out.println("=======================");
		
		ArrayList<Integer>n=new ArrayList<>();
		n.add(100);
		n.add(5555);
		n.add(45456464);
		n.add(48464);
		n.add(1004445);
		System.out.println(n);
		Integer max2 = Collections.max(n);
		System.out.println(max2);
		Integer min1=Collections.min(n);
		System.out.println(min1);
		
	}

}
