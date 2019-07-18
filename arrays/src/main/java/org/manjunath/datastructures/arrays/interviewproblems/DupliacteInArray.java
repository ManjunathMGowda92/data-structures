package org.manjunath.datastructures.arrays.interviewproblems;

/**
 * Class DupliacteInArray will find the duplicate exists in an array which is
 * ranging from 1 to n-1. The array may be in sorted or unsorted order
 * 
 * For example, if an array with length 4 contains numbers { 3, 1, 2, 3}, then
 * duplicated number is 3
 * 
 * @author Manjunath HM
 *
 */
public class DupliacteInArray {

	private int findDuplicate(int[] arr, int range) {

		int actualSum = 0;
		for (int i = 0; i < range; i++)
			actualSum += i;

		int arraySum = 0;
		for (int i : arr)
			arraySum += i;

		System.out.println(actualSum + "::" + arraySum);

		return arraySum - actualSum;
	}

	/**
	 * Method findDuplicateInArray() finds the duplicate present inside the
	 * input array with range from 1 to n-1
	 * 
	 * @param arr
	 *            Input Array containing one duplicate
	 * @return Duplicate element of array
	 */
	public int findDuplicateInArray(int[] arr) {
		return findDuplicate(arr, arr.length);
	}
}
