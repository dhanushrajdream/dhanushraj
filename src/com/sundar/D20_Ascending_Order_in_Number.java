package com.sundar;

import java.util.ArrayList;
import java.util.Collections;

public class D20_Ascending_Order_in_Number {
	
	public static void main(String[] args) {
		
		//method one
		int s[]= {50,20,40,30,10};
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
		//method two
		ArrayList<Integer>l=new ArrayList<>();
		l.add(50);
		l.add(30);
		l.add(10);
		l.add(20);
		System.out.println("Befor sorting"+l);
		Collections.sort(l);   //for sorting keyword
		System.out.println("After sorting"+l);
		Collections.reverse(l); //for reversing keyword.
		//finding ascending order and reversing it will show desending order
		System.out.println(l);
		
		System.out.println("===============================================");
		//String aseconding and descending order
				ArrayList<String>strin=new ArrayList<>();
				strin.add("dhanush");
				strin.add("anbarsu");
				strin.add("gowtham");
				strin.add("subi");
				System.out.println("Befor sorting"+strin);
				Collections.sort(strin);   //for sorting keyword
		     	System.out.println("After sorting"+strin);
				Collections.reverse(strin); //for reversing keyword.
				//finding ascending order and reversing it will show desending order
				System.out.println(strin);
	}

}
