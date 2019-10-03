package org.manjunath.matrix.problems;

import org.manjunath.matrix.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTwoDimentionalIdentityMatrix {
	private TwoDimentionalIdentityMatrix matrix;
	
	@BeforeClass
	public void doInitialization() {
		matrix = new TwoDimentionalIdentityMatrix();
	}
	
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "Testing whether the matrix is Identity or Not",
			expectedResult = "Should return true")
	@Test(testName = "testIsMatrixIsIdentityOrNot1", alwaysRun = true)
	public void testIsMatrixIsIdentityOrNot1() {
		Reporter.log("TestTwoDimentionalIdentityMatrix: Start of testIsMatrixIsIdentityOrNot1() method", true);
		
		try {
			int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1} };
			Assert.assertEquals(matrix.isMatrixIsIdentityOrNot(arr), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestTwoDimentionalIdentityMatrix: End of testIsMatrixIsIdentityOrNot1() method", true);
	}
	
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "Testing whether the matrix is Identity or Not",
			expectedResult = "Should return false")
	@Test(testName = "testIsMatrixIsIdentityOrNot2", alwaysRun = true)
	public void testIsMatrixIsIdentityOrNot2() {
		Reporter.log("TestTwoDimentionalIdentityMatrix: Start of testIsMatrixIsIdentityOrNot2() method", true);
		
		try {
			int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 1, 1} };
			Assert.assertEquals(matrix.isMatrixIsIdentityOrNot(arr), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestTwoDimentionalIdentityMatrix: End of testIsMatrixIsIdentityOrNot2() method", true);
	}
	
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "Testing whether the matrix is Identity or Not",
			expectedResult = "Should throw Exception")
	@Test(testName = "testIsMatrixIsIdentityOrNot3", alwaysRun = true, expectedExceptions = {RuntimeException.class})
	public void testIsMatrixIsIdentityOrNot3() {
		Reporter.log("TestTwoDimentionalIdentityMatrix: Start of testIsMatrixIsIdentityOrNot3() method", true);

		int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 1, 1, 7 } };
		Assert.assertEquals(matrix.isMatrixIsIdentityOrNot(arr), false);

		Reporter.log("TestTwoDimentionalIdentityMatrix: End of testIsMatrixIsIdentityOrNot3() method", true);
	}
	
	@AfterClass
	public void doDestroy() {
		matrix = null;
	}
}
