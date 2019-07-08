package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TrueOrFalseUsingMapTest {
	
		TrueOrFalseUsingMap trueOrFalseUsingMap;
		
		@Before
		public void setUp() {
			trueOrFalseUsingMap = new TrueOrFalseUsingMap();
		}
		
		@After
		public void tearDown() {
			trueOrFalseUsingMap = null;
		}
		
		@Test
		public void givenArrayOfStringShouldReturnTrueOrFalse(){
			
			String[] str = {"a","b","c","d","a","c","c"};
			Map<String, Boolean> expectedResult = new TreeMap<>();
			expectedResult.put("a", true);
			expectedResult.put("b",false);
			expectedResult.put("c",true);
			expectedResult.put("d",false);
			
			Map<String, Boolean> actualResult = trueOrFalseUsingMap.checkStringTrueOrFalse(str);
			assertEquals(expectedResult,actualResult);
		}
	
	@Test
	public void givenArrayOfNumericStringShouldReturnTrueOrFalse(){
		
		String[] str = {"11","1","4","4","54","4","1"};
		Map<String, Boolean> expectedResult = new TreeMap<>();
		expectedResult.put("4", true);
		expectedResult.put("11",false);
		expectedResult.put("1",true);
		expectedResult.put("54",false);
		
		Map<String, Boolean> actualResult = trueOrFalseUsingMap.checkStringTrueOrFalse(str);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenArrayOfNumeric1StringShouldReturnTrueOrFalse(){
		
		String[] str = {"11",null,"4","4","54","4","1"};
		Map<String, Boolean> expectedResult = new TreeMap<>();
		expectedResult.put("4", true);
		expectedResult.put("11",false);
		expectedResult.put("1",false);
		expectedResult.put("54",false);
		
		Map<String, Boolean> actualResult = trueOrFalseUsingMap.checkStringTrueOrFalse(str);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenInputShouldReturnNull(){
		
		assertNull(trueOrFalseUsingMap.checkStringTrueOrFalse(null));
	}
		
	
}




