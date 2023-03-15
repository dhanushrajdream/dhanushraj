package com.mytrynohelp;

import java.util.Set;
import java.util.TreeSet;

public class Array_2nd_Largest {

	public static void main(String[] args) {

		int a[] = { 86, 25, 45, 67, 89, 102 };
        int temp;
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp=a[i];
					a[i] = a[j];
					
					a[j]=temp;
                       
				}

			}

		}
	     System.out.println(a[4]);
	     
	}
	

}
