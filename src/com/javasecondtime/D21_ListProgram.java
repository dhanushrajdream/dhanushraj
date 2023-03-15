package com.javasecondtime;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class D21_ListProgram {
	
	public static void main(String[] args) {
		
		//array list
    	List<Object> obj = new ArrayList<>();
    	
    	obj.add(10);
    	obj.add(23);
    	obj.add(30);
    	obj.add(35);
    	System.out.println(obj);
    	
    	obj.add(44);
    	System.out.println(obj);
    	
        obj.remove(3);
    	System.out.println("remove index 3"+obj);
    	
    	obj.set(2, 1);
    	System.out.println(obj);
    	
    	boolean contains = obj.contains(55);
    	System.out.println(contains);
    	
    	Object object = obj.get(1);
    	System.out.println(object);
    	
    	int size = obj.size();
    	System.out.println(size);
    	
    	int indexOF = obj.indexOf(23);
    	System.out.println("indexOf 23 "+indexOF);
    	
    	//linked list
    	List<Object> obj1 = new LinkedList<>();
    	
    	obj1.add(23);
    	obj1.add(4);
    	obj1.add(3);
    	System.out.println(obj1);
    	
    	obj.addAll(obj1);
    	System.out.println("addAll"+obj);
    	
    	obj.retainAll(obj1);
    	System.out.println("retainAll"+obj);
    	
    	obj.removeAll(obj1);
    	System.out.println("removeAll"+obj);
    	
    	List<Object> obj2 = new Vector<>();
    	
    	obj2.add(31);
    	obj2.add(32);
    	obj2.add(33);
    	System.out.println(obj2);
    	
    	obj.add(obj2);
    	System.out.println(obj);
    	
    	
    	//siva sakthi program
    	 List<Object> ar = new ArrayList<Object>();
    	 List<Object> a= new LinkedList<Object>();
    	 List<Object> r = new Vector<Object>();
    	 
    	 ar.add("siva");
    	 ar.add(45);
    	 
    	 System.out.println("add"+ar);
    	 
    	 a.add("divya");
    	 a.add(67);
    	 
    	 System.out.println("add:"+a);
    	 r.add("us");
    	 r.add(43);
    	 
    	 System.out.println("add:"+r);
    	 
    	 ar.addAll(a);
    	 System.out.println("ADDALL:"+ar);
    	 
    	 ar.addAll(r);
    	 System.out.println("ADDALL:"+ar);
    	 
    	 int size2 = ar.size();
    	 System.out.println("size:"+size2);
    	 
    	 Object object2 = ar.get(2);
    	 System.out.println("get"+object2);
    	 
    	 ar.set(3, "**");
    	 System.out.println("remove :"+ar);
    	 
    	 ar.retainAll(r);
    	 ar.clear();
    	 System.out.println("clear:"+ar);
		
		
	}

}
