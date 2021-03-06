package com.qa.tests;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyArrayUtilsTest {
	private MyArrayUtils myArrayUtils;
	
	@Before
	public void setUp() throws Exception {
		myArrayUtils = new MyArrayUtils();
		System.out.println("Setup mathod is called");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Tear down method is called");
	}

	@Test
	public void findHighestInArrayofOne() {
		int[]array = {10};
		assertThat(MyArrayUtils.findHighest(array),is(10));
	}
	
	@Test
	public void findHighestInArrayofTwo(){
		int[]array = {20,10};
		assertThat(MyArrayUtils.findHighest(array),is(20));
		
	}

	
	@Test
	public void findHighestInArrayTest(){
		int[]array = {5,10,15,17,20,25,30};
		assertThat(MyArrayUtils.findHighest(array),is(30));
		
	}
}
