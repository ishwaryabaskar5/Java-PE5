package com.stackroute.pe5;

import java.util.Map;
import java.util.TreeMap;

public class TrueOrFalseUsingMap {

//	takes input as a string of words and returns true if the word appears 2 or more times else returns false
	public Map<String, Boolean> checkStringTrueOrFalse(String[] str) {
		
		if(str == null){
			return null;
		}
		Map<String,Boolean> map = new TreeMap<>();
		
		for (int i=0;i<str.length;i++) {
			if (str[i] == null){
				continue;
			}
			if (map.containsKey(str[i])) {      // checks the map whether the key is present or not
				map.put(str[i], true);
			} else {
				map.put(str[i],false);
			}
		}
		return map;
	}
}
