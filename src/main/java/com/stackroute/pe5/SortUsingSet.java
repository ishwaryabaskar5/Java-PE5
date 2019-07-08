package com.stackroute.pe5;

import java.util.*;

public class SortUsingSet {
	
	public List<String> sortNames(String[] names) {
	
//		checks for null
		if (names == null)
		{
			return null;
		}
//		converts array of values into treeset
		Set<String> sortedSet = new TreeSet<>(Arrays.asList(names));
		
//		adds sorted set into list og objects
		List<String> sortedList = new ArrayList<>(sortedSet);
		return sortedList;
	}
}
