package com.stackroute.pe5;

import java.util.Comparator;

//AgeCompare class implements Comparator interface for sorting based on student age in descending order
public class AgeCompare implements Comparator<Student> {
	
	NameCompare nameCompare = new NameCompare();
		public int compare(Student s1, Student s2) {
			
			if(s2.getAge() < s1.getAge()) {
				return -1;
			}
			else if(s2.getAge() == s1.getAge()) {
				nameCompare.compare(s1, s2);
				return 0;
			}
			else
				return 1;
			
		}
		
	}

//NameCompare class implements Comparator interface for sorting based on student name
class NameCompare implements Comparator<Student> {
		
		public int compare(Student s1, Student s2) {
			
			IdCompare idCompare = new IdCompare();
			if(s1.getName().compareTo(s2.getName()) > 0){
				return 1;
			} else if(s1.getName().compareTo(s2.getName()) < 0){
				return -1;
			} else {
				idCompare.compare(s1,s2);
				return 0;
			}
		}
		
	}

//IdCompare class implements Comparator interface for sorting based on student id
class IdCompare implements Comparator<Student> {
		
		public int compare(Student s1, Student s2) {
			
			return s2.getId()-s2.getId();
		}
		
	}

