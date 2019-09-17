package org.manjunath.matrix.problems;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLowerAndUpperPartOfMatrix {
	private LowerAndUpperPartOfMatrix matProb;
	
	@BeforeClass
	public void doInitialization() {
		matProb = new LowerAndUpperPartOfMatrix();
	}
	
	@Test(testName = "testGetLowerPartOfMatrix1", alwaysRun = true)
	public void testGetLowerPartOfMatrix1(){
		Reporter.log("TestLowerAndUpperPartOfMatrix: Start of testGetLowerPartOfMatrix1() method", true);
		
		try {
			int[][] inputMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			int[][] expectedMatrix = { { 1, 0, 0 }, { 4, 5, 0 }, { 7, 8, 9 } };
			
			Assert.assertEquals(matProb.getLowerPart(inputMatrix), expectedMatrix);
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestLowerAndUpperPartOfMatrix: End of testGetLowerPartOfMatrix1() method", true);
	}
	
	@Test(testName = "testGetLowerPartOfMatrix2", alwaysRun = true)
	public void testGetLowerPartOfMatrix2(){
		Reporter.log("TestLowerAndUpperPartOfMatrix: Start of testGetLowerPartOfMatrix2() method", true);
		
		try {
			int[][] inputMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {13, 14, 15, 16} };
			int[][] expectedMatrix = { { 1, 0, 0, 0 }, { 5, 6, 0, 0 }, { 9, 10, 11, 0 }, {13, 14, 15, 16} };
			
			Assert.assertEquals(matProb.getLowerPart(inputMatrix), expectedMatrix);
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestLowerAndUpperPartOfMatrix: End of testGetLowerPartOfMatrix2() method", true);
	}
	
	@Test(testName = "testGetUpperPartOfMatrix1", alwaysRun = true)
	public void testGetUpperPartOfMatrix1(){
		Reporter.log("TestLowerAndUpperPartOfMatrix: Start of testGetUpperPartOfMatrix1() method", true);
		
		try {
			int[][] inputMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			int[][] expectedMatrix = { { 1, 2, 3 }, { 0, 5, 6 }, { 0, 0, 9 } };
			
			Assert.assertEquals(matProb.getUpperPart(inputMatrix), expectedMatrix);
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestLowerAndUpperPartOfMatrix: End of testGetUpperPartOfMatrix1() method", true);
	}
	
	@Test(testName = "testGetUpperPartOfMatrix2", alwaysRun = true)
	public void testGetUpperPartOfMatrix2(){
		Reporter.log("TestLowerAndUpperPartOfMatrix: Start of testGetUpperPartOfMatrix2() method", true);
		
		try {
			int[][] inputMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {13, 14, 15, 16} };
			int[][] expectedMatrix = { { 1, 2, 3, 4 }, { 0, 6, 7, 8 }, { 0, 0, 11, 12 }, {0, 0, 0, 16} };
			
			Assert.assertEquals(matProb.getUpperPart(inputMatrix), expectedMatrix);
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestLowerAndUpperPartOfMatrix: End of testGetUpperPartOfMatrix2() method", true);
	}
	
	@AfterClass
	public void doDestroy() {
		matProb = null;
	}
}
