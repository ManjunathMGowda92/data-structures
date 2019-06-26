package org.manjunath.datastructures.arrays;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestTopTwoMaximumAndMinimumOfArray {
	private TopTwoMaximumAndMinimumOfArray test;
	
	@BeforeTest
	public void doInitialization() {
		test = new TopTwoMaximumAndMinimumOfArray();
	}
	
	@Test(testName = "testTopTwoMaximumOfArray1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test to find the maximum 2 elements from the given input array by using the method topTwoMaximum()",
	expectedResult = "method should return the array of maximum 2 elements from the array")
	public void testTopTwoMaximumOfArray1() {
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: Start of testTopTwoMaximumOfArray1() method", true);
		
		int[] numbers = {10, 15, 3, 95, 65, 84, 26, 45, 13, 94};
		try {
			int[] actualRes = {95, 94};
			int[] expectedRes = test.topTwoMaximum(numbers);
			
			org.testng.Assert.assertEquals(actualRes, expectedRes);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: End of testTopTwoMaximumOfArray1() method", true);
	}
	
	@Test(testName = "testTopTwoMaximumOfArray2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test to find the maximum 2 elements from the given input array by using the method topTwoMaximum()",
	expectedResult = "method should return the array of maximum 2 elements from the array")
	public void testTopTwoMaximumOfArray2() {
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: Start of testTopTwoMaximumOfArray2() method", true);
		
		int[] numbers = {5, -3, -89, -67, -32, -65, -87};
		try {
			int[] actualRes = {5, -3};
			int[] expectedRes = test.topTwoMaximum(numbers);
			
			org.testng.Assert.assertEquals(actualRes, expectedRes);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: End of testTopTwoMaximumOfArray2() method", true);
	}
	
	@Test(testName = "testTopTwoMinimumOfArray1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test to find the minimum 2 elements from the given input array by using the method topTwoMinimum()",
	expectedResult = "method should return the array of minimum 2 elements from the array")
	public void testTopTwoMinimumOfArray1() {
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: Start of testTopTwoMinimumOfArray1() method", true);
		
		int[] numbers = {10, 15, 3, 95, 65, 84, 26, 45, 13, 94};
		try {
			int[] actualRes = {3, 10};
			int[] expectedRes = test.topTwoMinimum(numbers);
			
			org.testng.Assert.assertEquals(actualRes, expectedRes);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: End of testTopTwoMinimumOfArray1() method", true);
	}
	
	@Test(testName = "testTopTwoMinimumOfArray2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test to find the minimum 2 elements from the given input array by using the method topTwoMinimum()",
	expectedResult = "method should return the array of minimum 2 elements from the array")
	public void testTopTwoMinimumOfArray2() {
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: Start of testTopTwoMinimumOfArray2() method", true);
		
		int[] numbers = {5, -3, -89, -67, -32, -65, -87};
		try {
			int[] actualRes = {-89, -87};
			int[] expectedRes = test.topTwoMinimum(numbers);
			
			org.testng.Assert.assertEquals(actualRes, expectedRes);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("AssertionError occurred : "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestTopTwoMaximumAndMinimumOfArray: End of testTopTwoMinimumOfArray2() method", true);
	}
	
	@AfterTest
	public void destroyObject() {
		test = null;
	}
}
