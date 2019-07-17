package org.manjunath.datastructures.arrays.interviewproblems;

import org.junit.Assert;
import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMaximumAndMinimumOfArray {
	private MaximumAndMinimumOfArray maxMin;

	@BeforeTest
	public void doInitialization() {
		maxMin = new MaximumAndMinimumOfArray();
	}

	@Test(testName = "testFindMaxAndMinOfArray1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "method should return the array of max and min in the format of {min, max}", 
	testCaseDescription = "To test the findMaxAndMinOfArray() method, wheteher it returns the min and max of input array or not")
	public void testFindMaxAndMinOfArray1() {
		Reporter.log("TestMaximumAndMinimumOfArray: Start of testFindMaxAndMinOfArray1() method", true);
		
		try {
			int[] arr = {4, 8, 2, 6, -12, -13, 98, 56, 232, 245, 6, -98};
			int[] expected = {-98, 245};
			
			Assert.assertArrayEquals(expected, maxMin.findMaxAndMinOfArray(arr));
		} catch (AssertionError e) {
			Reporter.log("TestMaximumAndMinimumOfArray: AssertionError occurred in testFindMaxAndMinOfArray1() method :"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("TestMaximumAndMinimumOfArray: Exception occurred in testFindMaxAndMinOfArray1() method :"+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMaximumAndMinimumOfArray: End of testFindMaxAndMinOfArray1() method", true);
	}
	
	
	@Test(testName = "testFindMaxAndMinOfArray2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "method should return the array of max and min in the format of {min, max}", 
	testCaseDescription = "To test the findMaxAndMinOfArray() method, wheteher it returns the min and max of input array or not")
	public void testFindMaxAndMinOfArray2() {
		Reporter.log("TestMaximumAndMinimumOfArray: Start of testFindMaxAndMinOfArray2() method", true);
		
		try {
			int[] arr = {-12, -13, -98, -56, -232, -245, -6, -8};
			int[] expected = {-245, -6};
			
			Assert.assertArrayEquals(expected, maxMin.findMaxAndMinOfArray(arr));
		} catch (AssertionError e) {
			Reporter.log("TestMaximumAndMinimumOfArray: AssertionError occurred in testFindMaxAndMinOfArray2() method :"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("TestMaximumAndMinimumOfArray: Exception occurred in testFindMaxAndMinOfArray2() method :"+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMaximumAndMinimumOfArray: End of testFindMaxAndMinOfArray2() method", true);
	}
	
	@Test(testName = "testFindMaxAndMinOfArray3", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "method should return the array of max and min in the format of {min, max}", 
	testCaseDescription = "To test the findMaxAndMinOfArray() method, wheteher it returns the min and max of input array or not")
	public void testFindMaxAndMinOfArray3() {
		Reporter.log("TestMaximumAndMinimumOfArray: Start of testFindMaxAndMinOfArray3() method", true);
		
		try {
			int[] arr = {4, 8, 2, 6, 45, 12, 35, 78, 134, 4546, 243, 898, 121, 987, 990};
			int[] expected = {2, 4546};
			
			Assert.assertArrayEquals(expected, maxMin.findMaxAndMinOfArray(arr));
		} catch (AssertionError e) {
			Reporter.log("TestMaximumAndMinimumOfArray: AssertionError occurred in testFindMaxAndMinOfArray3() method :"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("TestMaximumAndMinimumOfArray: Exception occurred in testFindMaxAndMinOfArray3() method :"+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMaximumAndMinimumOfArray: End of testFindMaxAndMinOfArray3() method", true);
	}

	@AfterTest
	public void doDestroy() {
		maxMin = null;
	}
}
