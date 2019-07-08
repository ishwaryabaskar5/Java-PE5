package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListOperationsTest {
	
	ArrayListOperations arrayListOperations;
	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	PrintStream originalOut = System.out;
	
	@Before
	public void setUp() {
		arrayListOperations = new ArrayListOperations();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown() {
		System.setOut(originalOut);
		arrayListOperations =null;
	}
	
	@Test
	public void givenInputShouldReturnUpdatedAndEmptyList(){
		List<String> list = new ArrayList<>(Arrays.asList("Apple","Grape","Melon", "Berry"));
		arrayListOperations.editArrayList(list,"Apple","Kiwi");
		assertEquals("Array Elements after update: [Kiwi, Grape, Melon, Berry]\n" +
				"Array list after removing all elements: []",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnErrorMessageAndEmptyList(){
		List<String> list = new ArrayList<>(Arrays.asList("Apple","Grape","Melon", "Berry"));
		arrayListOperations.editArrayList(list,"Mango","Kiwi");
		assertEquals("Mango is not found in list\n" +
				"Array list after removing all elements: []",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnErrorMessageNotFoundAndEmptyList(){
		List<String> list = new ArrayList<>();
		arrayListOperations.editArrayList(list,"Mango","Kiwi");
		assertEquals("Error: List is empty",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnEmptyListErrorMessage(){
		List<String> list = new ArrayList<>(Arrays.asList("Apple","Grape","Melon", "Berry"));
		arrayListOperations.editArrayList(list,"","Kiwi");
		assertEquals(" is not found in list\n"+
				"Array list after removing all elements: []",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnEmptyStringUpdatedandEmptyList(){
		List<String> list = new ArrayList<>(Arrays.asList("Apple","Grape","Melon", "Berry"));
		arrayListOperations.editArrayList(list,"Apple","");
		assertEquals("Array Elements after update: [, Grape, Melon, Berry]\n" +
				"Array list after removing all elements: []",outContent.toString());
	}
	
	
}