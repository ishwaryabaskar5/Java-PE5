package com.stackroute.pe5;

import java.util.List;

public class ArrayListOperations {
	
	public void editArrayList(List<String> list, String originalStr, String replaceStr){
	
//		checks for list is empty
		if(list.isEmpty()){
			System.out.print("Error: List is empty");
			return;
		}
		
//		finds the index of the string from list
		int index = list.indexOf(originalStr);
		
//		checks if index is not equal to -1
		if(index != -1) {
			list.set(index, replaceStr);
			System.out.println("Array Elements after update: " + list.toString());
		} else {
			System.out.println(originalStr+" is not found in list");
		}
		
//		clear the list data
		list.clear();
		System.out.print("Array list after removing all elements: "+list.toString());
		
	}
	
}

