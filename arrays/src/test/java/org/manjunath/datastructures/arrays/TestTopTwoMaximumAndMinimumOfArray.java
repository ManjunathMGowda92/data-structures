package org.manjunath.datastructures.arrays;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Reporter;
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
	testCaseDescription = "Test to find the maximum 2 elements from the given input array from the method topTwoMaximum() method",
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
}
