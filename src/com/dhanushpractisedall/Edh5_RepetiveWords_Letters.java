package com.dhanushpractisedall;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Edh5_RepetiveWords_Letters {

	public static void main(String[] args) {

		String s = "by the people for The people and everything is for people@@$%^&1234";

		String[] split = s.split(" "); // spliting string if("") letter by letter split

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();//linked hashmap insetion order

		for (String onebyone : split) { //getting one by one

			if (map.containsKey(onebyone)) { //inspect obo ,if there is already existing key(letter) update+1

				Integer number = map.get(onebyone); // inserting inside map and getting
				map.put(onebyone, number + 1);   //already exit  add one value
				
			} else {

				map.put(onebyone, 1); //if not add in new value
			}
		}
		System.out.println(map);
        //to get in solo, solo value
		Set<Entry<String, Integer>> entrySet = map.entrySet();  

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry);

			}

		}

		
	}

}
