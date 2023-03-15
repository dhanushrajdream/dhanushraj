package com.javabasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionMap {
	
	public static void main(String[] args) {
		
		/*hashmap
		 * it contains value based on key
		 * it contains only unique key
		 * it may have one null key & multiple null values
		 * it maintain random order 
		 * duplicate key(not allowed) *duplicate value (allowed)
		
		
		*/
		Map<Integer,Object> obj = new HashMap<>();
		Map<Integer,Object> obj1 = new LinkedHashMap<>();
		Map<Integer,Object> obj2 = new TreeMap<>();
		Map<Integer,Object> obj3 = new ConcurrentHashMap<>();
		Map<Integer,Object> obj4 = new Hashtable<>();
		
		obj.put(0, 12);
		obj.put(1, 45);
		obj.put(2, 9999);
		obj.put(3, 9999);
		obj.put(4, 89);
		obj.put(5, 00);
		obj.put(6, 80);
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		Object object = obj.get(5);
		System.out.println(object);
		
		Set<Integer> keySet = obj.keySet();
		System.out.println(keySet);
        
		boolean containsKey = obj.containsKey(40);
		System.out.println(containsKey);
		
		boolean containsValue = obj.containsValue(5);
		System.out.println(containsValue);
		
		Set<Entry<Integer, Object>> entrySet = obj.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
	}

}
