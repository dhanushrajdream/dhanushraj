package com.javasecondtime;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class D21_MapCollection {
	
	public static void main(String[] args) {
		
		//sivasakthi map
		
		//hash map
        Map<Integer,Object> obj = new HashMap<Integer,Object>(); 
		
		obj.put(1,"siva");
		obj.put(3,"78");
		obj.put(5,"java");
		obj.put(2,null);
		obj.put(null,"89");
		obj.put(9,null);
		obj.put(null,"43");
		
		System.out.println("put :"+obj);                       //put
		
		int size = obj.size();                                 //size
		System.out.println("size: "+size);
		
		Object object = obj.get(5);                            //get
		System.out.println("get :"+object);
		
		Set<Integer> keySet = obj.keySet();                    //keyset
		System.out.println("keyset"+keySet);
		
		Collection<Object> values = obj.values();              //values
		System.out.println("values :"+values);
        
		boolean containsKey = obj.containsKey(3);              //contain key
		System.out.println("contains key:"+containsKey);
		
		boolean containsValue = obj.containsValue("java");     //contains value
		System.out.println("contains value :"+containsValue);
		
		Set<Entry<Integer, Object>> entrySet = obj.entrySet(); //entry set
		System.out.println("entry set:"+entrySet);
		
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println("one by one entry set"+entry);
			
		}
		
		 //hashtable
		 Map<Integer,Object> hashtable = new Hashtable<Integer,Object>(); //hashtable
		 
		 hashtable.put(3, "ravi");
		 hashtable.put(4, "divya");
		 hashtable.put(9, "23");
		 hashtable.put(99, "506");
		 hashtable.put(5, "67");
		 hashtable.put(2, "89");
		 hashtable.put(7, "89");
		 hashtable.put(77, "77");
		 hashtable.put(10, "101");
		 hashtable.put(101, "555");
		 
		 
		 System.out.println("Hashtable  :"+hashtable);
		 
		 
		 //treemap
		 Map<Integer,Object> treemap = new TreeMap<Integer,Object>(); //treemap
		 
		 treemap.put(55, null);
		 treemap.put(45, "ravi");
		 treemap.put(4, "divya");
		 treemap.put(9, "23");
		 treemap.put(5, "67");
		 treemap.put(2, "89");
		 treemap.put(7, "89");
		 treemap.put(10, "101");
		 treemap.put(101, "101");
		 
		 System.out.println("treemap "+treemap);
		 
		 //concurent hashmap
		 
		 Map<Object,Object> concurrentmap = new ConcurrentHashMap<Object,Object>();
		 
		 concurrentmap.put(55, "zellos");
		 concurrentmap.put("ravi", "ravi");
		 concurrentmap.put(4, "divya");
		 concurrentmap.put(9, "23");
		 concurrentmap.put(5, "67");
		 concurrentmap.put(2, "89");
		 concurrentmap.put(7, "89");
		 concurrentmap.put(10, "1");
		 concurrentmap.put(10, "101");
		 concurrentmap.put(44, "67");
		 
		 System.out.println("concurrentmap "+concurrentmap);
		 
		 //linked hashmap
		 
		 Map<Integer,Object> linkedmap = new LinkedHashMap<Integer,Object>();
		 
		 linkedmap.put(55, null);
		 linkedmap.put(55, "ravi");
		 linkedmap.put(4, "divya");
		 linkedmap.put(9, "23");
		 linkedmap.put(77, null);
		 linkedmap.put(2, "89");
		 linkedmap.put(7, "89");
		 linkedmap.put(10, "101");
		 linkedmap.put(null, null);
		 
		 
		 //insertion order
		 
		 System.out.println("linkedmap "+linkedmap);
		 
		
	}

}
