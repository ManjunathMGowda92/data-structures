package org.manjunath.datastructures.arrays;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Class TestMaxAndMinTripletSumOfIntArray is a TestCase Class which is used to
 * test the methods of class MaxAndMinTripletSumOfIntArray
 * 
 * @author Manjunath HM
 *
 */
public class TestMaxAndMinTripletSumOfIntArray {
	private MaxAndMinTripletSumOfIntArray tripletSum;

	@BeforeTest
	public void doInitialization() {
		tripletSum = new MaxAndMinTripletSumOfIntArray();
	}

	@Test(testName = "testMaxTripletSum1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "Test the functionality of maxTripletSum() method, to get the maximum triplet sum from the given input array",
	expectedResult = "Maximum triplet sum of given Array, i.e 279")
	public void testMaxTripletSum1() {
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: Start of testMaxTripletSum1() method", true);
		
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
		
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: End of testMaxTripletSum1() method", true);
	}
	
	@Test(testName = "testMaxTripletSum2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test the functionality of maxTripletSum() method, to get the maximum triplet sum from the given input array",
	expectedResult = "Maximum triplet sum of given Array, i.e -12")
	public void testMaxTripletSum2() {
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: Start of testMaxTripletSum2() method", true);
		int[] arr = {-5, -9, -1, -16, -25, -12, -75, -98, -6};
		
		try {
			Assert.assertEquals(tripletSum.maxTripletSum(arr), -12);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: End of testMaxTripletSum2() method", true);
	}
	
	@Test(testName = "testMinTripletSum1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test the functionality of minTripletSum() method, to get the minimum triplet sum from the given input array",
	expectedResult = "Minimum triplet sum of given Array, i.e -83")
	public void testMinTripletSum1() {
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: Start of testMinTripletSum1() method", true);
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
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: End of testMinTripletSum1() method", true);
	}
	
	@Test(testName = "testMinTripletSum2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Test the functionality of minTripletSum() method, to get the minimum triplet sum from the given input array",
	expectedResult = "Maximum triplet sum of given Array, i.e 279")
	public void testMinTripletSum2() {
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: Start of testMinTripletSum2() method", true);
		int[] arr = {-5, -9, -1, -16, -25, -12, -75, -98, -6};
		
		try {
			Assert.assertEquals(tripletSum.minTripletSum(arr), -198);
		} catch (AssertionError e) {
			Reporter.log("AssertionError Occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestMaxAndMinTripletSumOfPosIntArray: End of testMinTripletSum2() method", true);
	}
	
	@AfterTest
	public void destroyObject(){
		tripletSum = null;
	}
}
