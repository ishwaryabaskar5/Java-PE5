package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortUsingSetTest {
	
	SortUsingSet sortUsingSet;
	
	@Before
	public void setUp() {
		sortUsingSet = new SortUsingSet();
	}
	
	@After
	public void tearDown() {
		sortUsingSet = null;
	}
	
	@Test
	public void givenSetShouldReturnSortedTest() {
		
		String[] expectedArray = {"Alice", "Bluto", "Eugene", "Harry", "Olive"};
		String[] originalArray = {"Harry", "Olive", "Alice", "Eugene", "Bluto"};
		List<String> expectedResult = new ArrayList<>(Arrays.asList(expectedArray));
		List<String> actualResult = sortUsingSet.sortNames(originalArray);
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	public void givenSetWithEmptyStringShouldReturnSortedTest() {
		
		String[] expectedArray = {"", "Bluto", "Harry", "Olive"};
		String[] originalArray = {"Harry", "Olive", "", "", "Bluto"};
		List<String> expectedResult = new ArrayList<>(Arrays.asList(expectedArray));
		List<String> actualResult = sortUsingSet.sortNames(originalArray);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenEmptySetShouldReturnNull() {

		assertNull(sortUsingSet.sortNames(null));
	}
}