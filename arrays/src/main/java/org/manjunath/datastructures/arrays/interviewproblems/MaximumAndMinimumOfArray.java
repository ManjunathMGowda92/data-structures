package org.manjunath.datastructures.arrays.interviewproblems;

/**
 * Class MaximumAndMinimumOfArray is used find the maximum and minimum elements
 * from the Array
 * 
 * @author Manjunath HM
 *
 */
public class MaximumAndMinimumOfArray {

	/**
	 * Method findMaxAndMinOfArray() finds the maximum and minimum elements from
	 * the array
	 * 
	 * @param arr
	 *            Array containing the integer elements
	 * @return Minimum and maximum elements of array in the format of {min, max}
	 */
	public int[] findMaxAndMinOfArray(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest)
				largest = num;

			if (num < smallest)
				smallest = num;
		}

		int[] nums = { smallest, largest };

		return nums;
	}
}
