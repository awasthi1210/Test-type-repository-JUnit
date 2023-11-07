package com.snc.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.snc.app.AdvancedCalculator;

public class AdvancedCalculatorTest {

	private static AdvancedCalculator advancedCalculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		advancedCalculator = new AdvancedCalculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}
/*
	@Test
	public void failedTest() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void ignoredTest() {
		System.out.println("This is a skipped test. In JUnit5, it will be implemented with @Disabled annotation");
	}

	@Test
	public void testSquareOfANumber() {
		Assert.assertEquals("", 5, advancedCalculator.square(16));
	}

	@Test
	public void testCubeOfANumber() {
		Assert.assertEquals("", 5, advancedCalculator.cube(16));
	}
*/
}
