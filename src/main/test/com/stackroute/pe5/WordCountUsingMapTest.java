package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountUsingMapTest {
	
	WordCountUsingMap wordCountUsingMap;
	
	@Before
	public void setUp() {
		wordCountUsingMap = new WordCountUsingMap();
	}
	
	@After
	public void tearDown() {
		wordCountUsingMap = null;
	}
	
	@Test
	public void givenStringShouldReturnWordCount(){
		Map<String, Integer> expectedResult = new HashMap<>();
		expectedResult.put("one",5);
		expectedResult.put("two",2);
		expectedResult.put("three",2);
		
		Map<String, Integer> actualResult = wordCountUsingMap.wordCount("one one -one___two,,three,one @three*one?two");
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenEmptyStringShouldReturn(){
		Map<String, Integer> expectedResult = new HashMap<>();
		expectedResult.put("",1);
		Map<String, Integer> actualResult = wordCountUsingMap.wordCount("");
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenInputShouldReturnNull(){
		assertNull(wordCountUsingMap.wordCount(null));
	}
	
	@Test
	public void givenInputShouldReturnWordCount(){
		Map<String, Integer> expectedResult = new HashMap<>();
		expectedResult.put("hello1",1);
		expectedResult.put("123",2);
		expectedResult.put("564",2);
		expectedResult.put("fjd",1);
		expectedResult.put("dhh",1);
		
		Map<String, Integer> actualResult = wordCountUsingMap.wordCount("hello1 123 123 564-fjd dhh 564");
		assertEquals(expectedResult,actualResult);
	}
	
}