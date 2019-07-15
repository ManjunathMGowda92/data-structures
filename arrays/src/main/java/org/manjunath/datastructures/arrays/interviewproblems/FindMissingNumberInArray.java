package org.manjunath.datastructures.arrays.interviewproblems;

/**
 * Class FindMissingNumberInArray is used to find the missing Array element
 * ranging form 1 to n. The class first finds the sum of n integers and then
 * subtracts the actual array sum to findout the missing number from the Array
 * 
 * @author Manjunath HM
 *
 */
public class FindMissingNumberInArray {

	/**
	 * Method getMissingNumber() is used to get the missing number in array
	 * ranging from 1 to n.
	 * 
	 * @param arr
	 *            Input Array which is having a missing number.
	 * @param range
	 *            Max Range of the array(i.e highest element)
	 * @return Number which is missing in the array
	 */
	public int getMissingNumber(int[] arr, int range) {
		int total = (range * (range + 1)) / 2;

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return total - sum;
	}

	/**
	 * Method execute() will internally calls the getMissingNumber() method to
	 * get the missing number of input array which is ranging from 1 to n
	 * 
	 * @param arr
	 *            Input Array which is having a missing number.
	 * @return Number which is missing in the array
	 */
	public int execute(int[] arr) {
		return getMissingNumber(arr, arr.length + 1);
	}
}
