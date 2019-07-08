package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

// count words in paragraph using map
public class WordCountUsingMap {

//	takes paragraph(string) as input and returns word and its counts as map key value pair
	public Map<String, Integer> wordCount(String str) {
		
		if(str == null){
			return null;
		}
		Map<String,Integer> map = new HashMap<>();
//		Split string using special chars
		String[] word = str.split("[ _,*\\-?@]+");
		int counter = 1;
		for (int i=0;i<word.length;i++) {
			if (map.containsKey(word[i])) {             //if map already contains the word add its key value
				map.put(word[i], map.get(word[i])+1);
			} else {
				map.put(word[i],counter);                //if the word is not in map set key as 1
			}
		}
		return map;
	}
}
