package org.manjunath.matrix.problems;

import org.manjunath.matrix.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMinElementOfRowInMatrix {
	private MinElementOfRowInMatrix matrix;

	@BeforeClass
	public void doInitialization() {
		matrix = new MinElementOfRowInMatrix();
	}

	@Test(testName = "testGetMinElementFromEachRow1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "to test the getMinElementFromEachRow() method to fetch min element from each row of an array",
	expectedResult = "method should return an array with min element of each row")
	public void testGetMinElementFromEachRow1() {
		Reporter.log("TestMinElementOfRowInMatrix: Start of testGetMinElementFromEachRow1() method", true);
		
		try {
			int[][] inputArray = { { 5, 2, 3 }, { 3, 5, 2 }, { 7, 47, 9 } };
			int[] expectedArray = { 2, 2, 7};
			
			Assert.assertEquals(matrix.getMinElementFromEachRow(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMinElementOfRowInMatrix: End of testGetMinElementFromEachRow1() method", true);
	}
	
	@Test(testName = "testGetMinElementFromEachRow2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "to test the getMinElementFromEachRow() method to fetch min element from each row of an array",
	expectedResult = "method should return an array with min element of each row")
	public void testGetMinElementFromEachRow2() {
		Reporter.log("TestMinElementOfRowInMatrix: Start of testGetMinElementFromEachRow2() method", true);
		
		try {
			int[][] inputArray = { { 12, 21, 3 }, { 31, 53, 62 }, { 27, 47, 96 } };
			int[] expectedArray = {3, 31, 27};
			
			Assert.assertEquals(matrix.getMinElementFromEachRow(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMinElementOfRowInMatrix: End of testGetMinElementFromEachRow2() method", true);
	}

	@AfterClass
	public void doDestroy() {
		matrix = null;
	}
}
