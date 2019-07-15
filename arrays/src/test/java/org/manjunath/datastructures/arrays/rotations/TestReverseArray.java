package org.manjunath.datastructures.arrays.rotations;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestReverseArray {
	private ReverseArray reverse;
	
	@BeforeTest
	public void doInitialization() {
		reverse = new ReverseArray();
	}
	
	@Test(testName = "testReverseArray1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", expectedResult = "Reverse of input Array", testCaseDescription = "To test the reverseArray() method")
	public void testReverseArray1() {
		Reporter.log("TestReverseArray: Strat of testReverseArray1() method", true);
		
		try {
			int[] actualArr = {4, 5, 6, 7, 8, 9};
			int[] expectedArr = {9, 8, 7, 6, 5, 4};
			
			reverse.reverseArray(actualArr);
			
			Assert.assertEquals(actualArr, expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestReverseArray: End of testReverseArray1() method", true);
	}
	
	
	@Test(testName = "testReverseArray2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", expectedResult = "Reverse of input Array", testCaseDescription = "To test the reverseArray() method")
	public void testReverseArray2() {
		Reporter.log("TestReverseArray: Strat of testReverseArray1() method", true);
		
		try {
			int[] actualArr = {1, 3, 11, 15, 19, 23, 45, -3, -56, -76, 4, 5, 6, 7, 8, 9};
			int[] expectedArr = {9, 8, 7, 6, 5, 4, -76, -56, -3, 45, 23, 19, 15, 11, 3, 1};
			
			reverse.reverseArray(actualArr);
			
			Assert.assertEquals(actualArr, expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred : "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestReverseArray: End of testReverseArray1() method", true);
	}
	
	@AfterTest
	public void doDestroy() {
		reverse = null;
	}
}
