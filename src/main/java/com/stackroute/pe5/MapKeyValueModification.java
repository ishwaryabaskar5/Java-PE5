package com.stackroute.pe5;

import java.util.*;

public class MapKeyValueModification {
	public Map<String,String> modifyValue(Map<String,String> map){
	
//		checks if map is null
		if(map == null){
			return null;
		}
//	    Get key of map as a set
		Set<String> keySet = map.keySet();
//		Get values of map as a ArrayList
		Collection<String> valueSet = new ArrayList<>(map.values());
//		Creating iterator for both key and value
		Iterator keyIterator = keySet.iterator();
		Iterator valueIterator = valueSet.iterator();

//		Replace the value of first map element with empty string
		String key = (String)keyIterator.next();
		map.replace(key, map.get(key),"");
		
//		Replace the remaining values of map with its previous key value
		while (keyIterator.hasNext()) {
			key = (String)keyIterator.next();
			String temp = (String)valueIterator.next();
			map.replace(key, map.get(key),temp) ;
		}
		return map;
	}
}
