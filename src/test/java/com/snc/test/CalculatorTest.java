package com.snc.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.snc.app.Calculator;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
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
*/
	@Test
	public void testAdd() {
		Assert.assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testSubtract() {
		Assert.assertEquals(2, calculator.subtract(5, 3));
	}

	@Test
	public void testMultiply() {
		Assert.assertEquals(15, calculator.multiply(3, 5));
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(2, calculator.divide(10, 5));
	}
/*
	@Test
	public void testDivideByZero() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
			calculator.divide(10, 0);
		});
	}
*/	
}
