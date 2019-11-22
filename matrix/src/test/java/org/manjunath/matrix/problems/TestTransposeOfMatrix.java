package org.manjunath.matrix.problems;

import org.manjunath.matrix.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTransposeOfMatrix {
	private TransposeOfMatrix transpose;
	
	@BeforeClass
	public void doInitialization(){
		transpose = new TransposeOfMatrix();
	}
	
	@AfterClass
	public void doDestroy(){
		transpose = null;
	}
	
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To test the transpose method of TransposeOfMatrix Class",
			expectedResult = "Method should return the Transposed matrix")
	@Test(testName = "testTransposeRunner1", alwaysRun = true)
	public void testTransposeRunner1(){
		Reporter.log("TestTransposeOfMatrix: Start of testTransposeRunner1() method", true);
		try {
			int[][] inputArray = new int[][] { 
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 3, 4, 5, 6, 7 } 
			};

			int[][] expectedArray = new int[][] { 
				{ 1, 1, 1, 1 }, 
				{ 2, 2, 2, 2 },
				{ 3, 3, 3, 3 },
				{ 4, 4, 4, 4 },
				{ 5, 5, 5, 5 },
				{ 6, 6, 6, 6 },
				{ 7, 7, 7, 7 } 
			};

			Assert.assertEquals(transpose.runner(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestTransposeOfMatrix: End of testTransposeRunner1() method", true);
	}
	
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To test the transpose method of TransposeOfMatrix Class",
			expectedResult = "Method should return the Transposed matrix")
	@Test(testName = "testTransposeRunner2", alwaysRun = true)
	public void testTransposeRunner2(){
		Reporter.log("TestTransposeOfMatrix: Start of testTransposeRunner2() method", true);
		try {
			int[][] inputArray = new int[][] {
				{1, 2, 3},
				{4, 5, 6},
				{3, 4, 5}
			};
			
			int[][] expectedArray = new int[][]{
				{1,  4,  3},
				{2,  5,  4},
				{3,  6,  5}
			};
			Assert.assertEquals(transpose.runner(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestTransposeOfMatrix: End of testTransposeRunner2() method", true);
	}
	
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To test the transpose method of TransposeOfMatrix Class",
			expectedResult = "Method should return the Transposed matrix")
	@Test(testName = "testTransposeRunner3", alwaysRun = true)
	public void testTransposeRunner3(){
		Reporter.log("TestTransposeOfMatrix: Start of testTransposeRunner3() method", true);
		try {
			int[][] inputArray = new int[][] {
				{1, 2, 3, 8, 9, 0, 4, 5},
				{4, 5, 6, 7, 2, 1, 8, 9}
			};
			int[][] expectedArray = new int[][]{
				{1,  4}, {2,  5},
				{3,  6}, {8,  7},
				{9,  2}, {0,  1},
				{4,  8}, {5,  9}
			};
			Assert.assertEquals(transpose.runner(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestTransposeOfMatrix: End of testTransposeRunner3() method", true);
	}
	
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To test the transpose method of TransposeOfMatrix Class",
			expectedResult = "Method should return the Transposed matrix")
	@Test(testName = "testTransposeRunner4", alwaysRun = true, expectedExceptions = {NullPointerException.class, Exception.class})
	public void testTransposeRunner4(){
		Reporter.log("TestTransposeOfMatrix: Start of testTransposeRunner4() method", true);
		transpose.runner(null);
		Reporter.log("TestTransposeOfMatrix: End of testTransposeRunner4() method", true);
	}
}
