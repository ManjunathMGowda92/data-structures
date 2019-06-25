package org.manjunath.datastructures.arrays;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMaxAndMinTripletSumOfPosIntArray {
	private MaxAndMinTripletSumOfPosIntArray tripletSum;

	@BeforeTest
	public void doInitialization() {
		tripletSum = new MaxAndMinTripletSumOfPosIntArray();
	}

	@Test(testName = "testMaxTripletSum1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "Test the functionality of maxTripletSum() method, to get the maximum triplet sum from the given input array",
	expectedResult = "Maximum triplet sum of given Array, i.e 279")
	public void testMaxTripletSum1() {
		int[] arr = {10, 85, -35, 98, 23, 15, -12, -36, 96, 16};
		
		try {
			Assert.assertEquals(tripletSum.maxTripletSum(arr), 279);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred: "+e, true);
			Assert.assertTrue(false);
		}
	}
	
	@Test(testName = "testMinTripletSum1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test the functionality of minTripletSum() method, to get the minimum triplet sum from the given input array",
	expectedResult = "Minimum triplet sum of given Array, i.e -83")
	public void testMinTripletSum1() {
		int[] arr = {10, 85, -35, 98, 23, 15, -12, -36, 96, 16};
		try {
			Assert.assertEquals(tripletSum.minTripletSum(arr), -83);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred: "+e, true);
			Assert.assertTrue(false);
		}
	}
}
