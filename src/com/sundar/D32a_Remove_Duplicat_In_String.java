package com.sundar;

import java.util.LinkedHashSet;

public class D32a_Remove_Duplicat_In_String {
	
	public static void main(String[] args) {
		
		
		String t="Welcomethejurrasicpark";
		char d[]=t.toCharArray();
		LinkedHashSet<Character>c=new LinkedHashSet<>();
		for(int i=0;i<d.length;i++) {
			c.add(d[i]);
		}
		System.out.println(c);
		for (Character character : c) {
			System.out.print(character);
		}
		
	}

}
