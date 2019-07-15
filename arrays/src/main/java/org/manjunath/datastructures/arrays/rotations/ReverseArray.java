package org.manjunath.datastructures.arrays.rotations;

/**
 * Class ReverseArray is used to reverse the integer array.
 * 
 * @author Manjunath HM
 *
 */
public class ReverseArray {
	/**
	 * Method reverseArray() is used to reverse the input array.
	 * 
	 * @param arr
	 *            Array to be reversed.
	 */
	public void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}
}
