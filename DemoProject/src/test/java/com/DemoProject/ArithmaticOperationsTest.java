package com.DemoProject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ArithmaticOperationsTest
{
	private static ArithmaticOperations arOperations;


	@BeforeClass
	public static void init() {
		arOperations = new ArithmaticOperations();
	}

	@Before
	public void beforeEachTest() {
		//System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		//System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum() {
		int result = arOperations.sum(3, 4);
		System.out.println("Result of Overriden function sum(3, 4) is like :- " + result);
		
		System.out.println("Made the changes");
		assertEquals(7, result);
	}

	@Test
	public void testDivison() {
		try {
			int result = arOperations.divison(10, 2);
			System.out.println("Result of Overriden function divison(10, 2) is :- " + result);
			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		arOperations.divison(10, 0);
		
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = arOperations.equalIntegers(20, 20);
		System.out.println("Result of Overriden function arOperations.equalIntegers(20, 20) is :- " + result);
		assertFalse(result);
	}

	@Test(expected = AssertionError.class)
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 9);
	}

}
