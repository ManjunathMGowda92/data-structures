package org.manjunath.matrix.problems;

import org.manjunath.matrix.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMaxElementOfRowInMatrix {
	private MaxElementOfRowInMatrix matrix;

	@BeforeClass
	public void doInitialization() {
		matrix = new MaxElementOfRowInMatrix();
	}

	@Test(testName = "testGetMaxElementFromEachRow1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "to test the getMaxElementFromEachRow() method to fetch max element from each row of an array",
	expectedResult = "method should return an array with max element of each row")
	public void testGetMaxElementFromEachRow1() {
		Reporter.log("TestMaxElementOfRowInMatrix: Start of testGetMaxElementFromEachRow1() method", true);
		
		try {
			int[][] inputArray = { { 5, 2, 3 }, { 3, 5, 2 }, { 7, 47, 9 } };
			int[] expectedArray = { 5, 5, 47};
			
			Assert.assertEquals(matrix.getMaxElementFromEachRow(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMaxElementOfRowInMatrix: End of testGetMaxElementFromEachRow1() method", true);
	}
	
	@Test(testName = "testGetMaxElementFromEachRow2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "to test the getMaxElementFromEachRow() method to fetch max element from each row of an array",
	expectedResult = "method should return an array with max element of each row")
	public void testGetMaxElementFromEachRow2() {
		Reporter.log("TestMaxElementOfRowInMatrix: Start of testGetMaxElementFromEachRow2() method", true);
		
		try {
			int[][] inputArray = { { 12, 21, 3 }, { 31, 53, 62 }, { 27, 47, 96 } };
			int[] expectedArray = {21, 62, 96};
			
			Assert.assertEquals(matrix.getMaxElementFromEachRow(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMaxElementOfRowInMatrix: End of testGetMaxElementFromEachRow2() method", true);
	}

	@AfterClass
	public void doDestroy() {
		matrix = null;
	}
}
