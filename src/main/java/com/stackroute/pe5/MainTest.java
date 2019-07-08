package com.stackroute.pe5;

import java.util.*;

public class MainTest {
	
	public static void main(String[] args){
	
//		initialize student objects
		Student s1 = new Student(103, "Alice", 15);
		Student s2 = new Student(105, "Bob", 18);
		Student s3 = new Student(109, "David", 23);
		Student s4 = new Student(101, "Jack", 15);
		Student s5 = new Student(102, "Mike", 21);
		Student s6 = new Student(104, "Jack", 15);

//		Array and List of Student object
		Student[] studArr = {s1, s2, s3, s4, s5,s6};
		List<Student> list = new ArrayList<>(Arrays.asList(studArr));
		
//		call the sort method
		Collections.sort(list, new AgeCompare());
		
		System.out.println("Id\tName\tAge");
		for (Student s: list){
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge());
		}
	}
	
}