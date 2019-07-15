package org.manjunath.datastructures.arrays.interviewproblems;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFindMissingNumberInArray {
	private FindMissingNumberInArray missingNumber;

	@BeforeTest
	public void doInitialization() {
		missingNumber = new FindMissingNumberInArray();
	}

	@Test(testName = "findMissingNumberFromArray1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", expectedResult = "To get missing number from the array", testCaseDescription = "to test the method returns the proper missing number or not")
	public void findMissingNumberFromArray1() {
		Reporter.log("TestFindMissingNumberInArray: Start of findMissingNumberFromArray1() method", true);

		try {
			int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

			int number = missingNumber.execute(arr);
			Assert.assertEquals(number, 4);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: " + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: " + e, true);
			Assert.assertTrue(false);
		}

		Reporter.log("TestFindMissingNumberInArray: End of findMissingNumberFromArray1() method", true);
	}

	@AfterTest
	public void doDestroy() {
		missingNumber = null;
	}
}
