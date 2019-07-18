package org.manjunath.datastructures.arrays.interviewproblems;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDupliacteInArray {
	private DupliacteInArray dupArray;
	
	@BeforeTest
	public void doInitialization(){
		dupArray = new DupliacteInArray();
	}
	
	@Test(testName = "testFindDuplicateInArray1", alwaysRun=true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "duplicate of array should be returned", 
	testCaseDescription = "Test method to get duplicate element of Array")
	public void testFindDuplicateInArray1(){
		Reporter.log("TestDupliacteInArray: Start of testFindDuplicateInArray1() method", true);
		
		try {
			int[] arr = { 1, 4, 3, 6, 2, 5, 7, 9, 8, 10, 15, 13, 14, 11, 12, 15, 16, 17, 18 };
			Assert.assertEquals(dupArray.findDuplicateInArray(arr), 15);
			
		} catch (AssertionError e) {
			Reporter.log("TestDupliacteInArray: testFindDuplicateInArray1 --> AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("TestDupliacteInArray: testFindDuplicateInArray1 --> Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestDupliacteInArray: End of testFindDuplicateInArray1() method", true);
	}
	
	@Test(testName = "testFindDuplicateInArray2", alwaysRun=true)
	@TestCase(Author = "Manjunath HM", 
	expectedResult = "duplicate of array should be returned", 
	testCaseDescription = "Test method to get duplicate element of Array")
	public void testFindDuplicateInArray2(){
		Reporter.log("TestDupliacteInArray: Start of testFindDuplicateInArray2() method", true);
		
		try {
			int[] arr = { 1, 4, 3, 6, 2, 5, 6};
			Assert.assertEquals(dupArray.findDuplicateInArray(arr), 6);
			
		} catch (AssertionError e) {
			Reporter.log("TestDupliacteInArray: testFindDuplicateInArray2 --> AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("TestDupliacteInArray: testFindDuplicateInArray2 --> Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestDupliacteInArray: End of testFindDuplicateInArray2() method", true);
	}
	
	@AfterTest
	public void doDestroy(){
		dupArray = null;
	}
}
