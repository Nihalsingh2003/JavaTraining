package com.aurionpro.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import com.aurionpro.junit.model.Calculator;

public class CalculatorTest {
	Calculator cal = new Calculator();

	@BeforeAll
	public static void start() {
		System.out.println("Before starting of any test");
	}
	@AfterAll
	public static void end() {
		System.out.println("After all test");
	}
	
	
	@DisplayName(value="Na")
	@Test
	public void testAdd() {
		int sum = cal.add(2, 2);
		assertEquals(4, sum);
	}

	@Test
	public void testDivision() {
		assertThrows(ArithmeticException.class, () -> cal.division(10, 0));
	}

	@Test
	@RepeatedTest(5)
	public void testTrue() {
		assertTrue(7 > 0);
	}

	@Test
	@Disabled("under process")
	public void testFalse() {
		assertFalse(7 < 0);
	}

}
