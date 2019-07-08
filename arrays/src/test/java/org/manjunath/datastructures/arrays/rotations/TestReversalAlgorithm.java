package org.manjunath.datastructures.arrays.rotations;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestReversalAlgorithm {
	private ReversalAlgorithm algo;
	
	@BeforeTest
	public void doInitialization(){
		algo = new ReversalAlgorithm();
	}
	
	@Test(testName = "testLeftRotateOfReverseAlgo", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "To test the given integer input array is rotated or not", expectedResult= "Array should be rotated")
	public void testLeftRotateOfReverseAlgo1() {
		Reporter.log("TestReversalAlgorithm: Start of testLeftRotateOfReverseAlgo1() method", true);
		
		try {
			int[] actual = {3, 4, 5, 6, 7, 8, 9};
			int[] expected = {6, 7, 8, 9, 3, 4, 5};
			
			Assert.assertEquals(algo.executeLeftRotate(actual, 3), expected);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestReversalAlgorithm: End of testLeftRotateOfReverseAlgo1() method", true);
	}
	
	@Test(testName = "testLeftRotateOfReverseAlgo2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "To test the given integer input array is rotated or not", expectedResult= "Array should be rotated")
	public void testLeftRotateOfReverseAlgo2() {
		Reporter.log("TestReversalAlgorithm: Start of testLeftRotateOfReverseAlgo2() method", true);

		try {
			int[] actual = { 31, 41, 51, 61, 17, 18, 19, 23, 78, 45, 99, 145, 167 };
			int[] expected = { 18, 19, 23, 78, 45, 99, 145, 167, 31, 41, 51, 61, 17 };

			Assert.assertEquals(algo.executeLeftRotate(actual, 5), expected);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: " + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: " + e, true);
			Assert.assertTrue(false);
		}

		Reporter.log("TestReversalAlgorithm: End of testLeftRotateOfReverseAlgo2() method", true);
	}
	
	@AfterTest
	public void destroyObject() {
		algo = null;
	}
}
