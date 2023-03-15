package com.javasecondtime;

public class Array_TwoDimArray {
	
	public static void main(String[] args) {
		
		//one dimensional array
		int a[]=new int[5];
		a[0]=44;
		a[1]=66;
		a[3]=10;
		a[2]=5;
		a[4]=555;
		
		for (int i = 0; i <5; i++) {
			System.out.println("value of "+i+"===="+a[i]);
	
		    
		}   //two dimensioanl array
			System.out.println("***************");
			int b[][] = {{10,20},{30,40}};     //(0,0),(0,1),(1,0),(1,1)
			for (int j = 0; j <2; j++) {
				System.out.println("value of j ="+j);
						
            for (int k = 0; k <2; k++) {
            	System.out.println("value of k ="+k);
           	 	System.out.println(b[j][k]);
				
			}				
			}
		
		
		
		
		
		
	}
}
