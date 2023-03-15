package com.javasecondtime;

import java.util.Set;
import java.util.TreeSet;

public class D21_SetCollection {
	
	public static void main(String[] args) {
		
		/* hashset
		   * 1)it prints in random order
		   * 2)it will not allow duplicate value
		   * 3)it will single null value ,not a duplicate null value
		   */
		
/*		
		  Set<Object> obj = new HashSet<>();
		  
		  obj.add(24);
		  obj.add("java");
		  obj.add("oracle");
		  obj.add("FZ");
		  obj.add(2002);
		  obj.add(2002);
		  obj.add(2029);
		  obj.add(null);
		  //obj.add(null); //3)it will allow single null value ,not a duplicate null value
		  System.out.println(obj);
		  //obj.add(2029); //2)this will not allow duplicate
		  
		  int size = obj.size();
	      System.out.println(size);
	      
	      //obj.clear();
	      // System.out.println(obj);
*/	     
	       
	       
	      
	      /*Linked hashset:
	       *1)it prints in insertion
	       *2)it will not allow duplicate value
	       *3)it will allow single null value,not a duplicate null value
	       */
/*	      Set<Object> obj1 = new LinkedHashSet<>();
	      
	      obj1.add(25);
	      obj1.add(2003);
	      obj1.add(3);
	      obj1.add(5);
	      obj1.add(1000002);
	      obj1.add(1000002); //will not allow duplicate
	      obj1.add(534);
	      obj1.add(999);
	      obj1.add(555);
	      obj1.add(33);
	      obj1.add(null);
	      obj1.add(null);
	      obj1.add("selleenium");
	      System.out.println(obj1);
	      
	      //obj.add(obj1);   // this will put inside a hashset
	      //System.out.println(obj);
*/	      
	      
	      /*treeset
	       *1)it prints in ascending order
	       *2)it will not allow duplicate values
	       *3)it will not allow even a single null value 
	       */
	      
	      Set<Object> obj3 = new TreeSet<>();
	      
	      obj3.add(1);
	      obj3.add(999);
	      obj3.add(24);
		  obj3.add(2002);
		  obj3.add(2002);
		  obj3.add(2029);
		  //obj3.add(null);  //this will through null pointer exception
		  System.out.println(obj3);
		
	}

}
