package com.snc.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.snc.test.*;

@RunWith(Suite.class)
@SuiteClasses({ 
	CalculatorTest.class, 
	AdvancedCalculatorTest.class 
	})
public class TestAll {
	public static class Suite {
	}
}
