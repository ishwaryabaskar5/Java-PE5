package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapKeyValueModificationTest {
	MapKeyValueModification mapKeyValueModification;
	
	@Before
	public void setUp() {
		mapKeyValueModification = new MapKeyValueModification();
	}
	
	@After
	public void tearDown() {
		mapKeyValueModification = null;
	}
	
	@Test
	public void givenMapWithSingleElementsShouldReturnModifiedMap(){
		Map<String, String> map = new LinkedHashMap<>();
		map.put("val1","one");
		
		Map<String, String> expectedResult = new LinkedHashMap<>();
		expectedResult.put("val1","");
		
		Map<String, String> actualResult = mapKeyValueModification.modifyValue(map);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenMapWithTwoElementsShouldReturnModifiedMap(){
		Map<String, String> map = new LinkedHashMap<>();
		map.put("one","one");
		map.put("two","two");
		
		Map<String, String> expectedResult = new LinkedHashMap<>();
		expectedResult.put("one","");
		expectedResult.put("two","one");
		
		Map<String, String> actualResult = mapKeyValueModification.modifyValue(map);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenMapWithFourElementsShouldReturnModifiedMap(){
		Map<String, String> map = new LinkedHashMap<>();
		map.put("val1","java");
		map.put("val2","c");
		map.put("val3","c++");
		map.put("val4","python");
		
		Map<String, String> expectedResult = new LinkedHashMap<>();
		expectedResult.put("val1","");
		expectedResult.put("val2","java");
		expectedResult.put("val3","c");
		expectedResult.put("val4","c++");
		
		Map<String, String> actualResult = mapKeyValueModification.modifyValue(map);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void givenInputShouldReturnNull(){
		
		assertNull(mapKeyValueModification.modifyValue(null));
	}
	
}