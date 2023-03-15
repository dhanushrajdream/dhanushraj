package com.advancedjava;

public class day15_ArrayProgram {
	public static void main(String[] args) {
		
		//syntax
		int d[] = new int[200];
		
		d[1]=55;
		d[2]=21;
		d[3]=91;
		d[4]=365;
		d[5]=200;
		
		
		                                          // first type but its long so we go for
		//System.out.println(d[1]);
		//System.out.println(d[2]);
		//System.out.println(d[3]);
		//System.out.println(d[4]);
		//System.out.println(d[5]);
		
                                                  //will not print this due to out of bound
	    //System.out.println(d[300]);
		
		                                          //for working
		//for(int i = 0; i < d.length; i++) {
		//	System.out.println(d[i]);	
		//}
		                                          //using for each more easy
		for (int i : d) {
			System.out.println(i);
			
		}
	
        
	
	}

}
