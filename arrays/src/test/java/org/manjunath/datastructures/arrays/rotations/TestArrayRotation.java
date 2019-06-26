package org.manjunath.datastructures.arrays.rotations;

import org.manjunath.datastructures.arrays.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestArrayRotation {
	private ArrayRotation rotation;
	
	@BeforeTest
	public void doInitialization() {
		rotation = new ArrayRotation();
	}
	
	@Test(testName = "testExecuteLeftRotate1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "Execute the executeLeftRotate() method to test array is rotating in left rotations or not",
	expectedResult = "Array should be rotated in left direction for number of rotations specified")
	public void testExecuteLeftRotate1(){
		Reporter.log("TestArrayRotation: Start of testExecuteLeftRotate1() method", true);
		
		try {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int[] expectedArr = {3, 4, 5, 6, 7, 8, 9, 1, 2};
			
			int[] outputArr = rotation.executeLeftRotate(arr, 2);
			Assert.assertEquals(outputArr, expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		 
		Reporter.log("TestArrayRotation: End of testExecuteLeftRotate1() method", true);
	}
	
	@AfterTest
	public void destroyObject() {
		rotation = null;
	}
}
