package org.manjunath.matrix.problems;

import org.manjunath.matrix.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMatrixScalarMultiplication {
	private MatrixScalarMultiplication scalarMultiplication;
	
	@BeforeClass
	public void doInitialize() {
		scalarMultiplication = new MatrixScalarMultiplication();
	}
	
	@Test(testName = "testScalarMultiplication1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "Matrix should be mulitiplied with the scalar constant",
	testCaseDescription = "Test the scalar multiplication of matrix")
	public void testScalarMultiplication1() {
		Reporter.log("TestMatrixScalarMultiplication: Start of testScalarMultiplication1() method", true);
		
		try {
			int[][] inputMatrix = { { 2, 4 }, { 5, 6 } };
			int[][] expectedMatrix = { { 10, 20}, { 25, 30 } };
			int scalarValue = 5;
			
			Assert.assertEquals(scalarMultiplication.executeScalarMultiplication(inputMatrix, scalarValue), expectedMatrix);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMatrixScalarMultiplication: End of testScalarMultiplication1() method", true);
	}
	
	@Test(testName = "testScalarMultiplication2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "Matrix should be mulitiplied with the scalar constant",
	testCaseDescription = "Test the scalar multiplication of matrix")
	public void testScalarMultiplication2() {
		Reporter.log("TestMatrixScalarMultiplication: Start of testScalarMultiplication2() method", true);
		
		try {
			int[][] inputMatrix = { { 2, 4, 1 }, { 5, 6, 7 } };
			int[][] expectedMatrix = { { 10, 20, 5}, { 25, 30, 35 } };
			int scalarValue = 5;
			
			Assert.assertEquals(scalarMultiplication.executeScalarMultiplication(inputMatrix, scalarValue), expectedMatrix);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMatrixScalarMultiplication: End of testScalarMultiplication2() method", true);
	}
	
	@Test(testName = "testScalarMultiplication3", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "Matrix should be mulitiplied with the scalar constant",
	testCaseDescription = "Test the scalar multiplication of matrix")
	public void testScalarMultiplication3() {
		Reporter.log("TestMatrixScalarMultiplication: Start of testScalarMultiplication3() method", true);
		
		try {
			int[][] inputMatrix = { { 2, 4, 1 }, { 5, 6, 7 }, { 11, 15, 10 } };
			int[][] expectedMatrix = { { 10, 20, 5}, { 25, 30, 35 }, { 55, 75, 50 } };
			int scalarValue = 5;
			
			Assert.assertEquals(scalarMultiplication.executeScalarMultiplication(inputMatrix, scalarValue), expectedMatrix);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestMatrixScalarMultiplication: End of testScalarMultiplication3() method", true);
	}
	
	@AfterClass
	public void doDestroy() {
		scalarMultiplication = null;
	}
}
