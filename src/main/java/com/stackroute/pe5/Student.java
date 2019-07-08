package com.stackroute.pe5;

public class Student {
	private int id;
	private String name;
	private int age;
	
//	constructor
	Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
//	getter and setter methods
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
