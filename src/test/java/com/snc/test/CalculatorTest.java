package com.snc.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.snc.app.Calculator;

class CalculatorTest {

	private static Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void failedTest() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void ignoredTest() {
		System.out.println("This is a skipped test. In JUnit5, it will be implemented with @Disabled annotation");
	}

	@Test
	public void testAdd() {
		Assertions.assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testSubtract() {
		Assertions.assertEquals(2, calculator.subtract(5, 3));
	}

	@Test
	public void testMultiply() {
		Assertions.assertEquals(15, calculator.multiply(3, 5));
	}

	@Test
	public void testDivide() {
		Assertions.assertEquals(2, calculator.divide(10, 5));
	}

	@Test
	public void testDivideByZero() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			calculator.divide(10, 0);
		});
	}
}
