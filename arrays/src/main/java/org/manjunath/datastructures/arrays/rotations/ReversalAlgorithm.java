package org.manjunath.datastructures.arrays.rotations;

/**
 * Class ReversalAlgorithm is used to rotate the given array for specified
 * number.
 * <p> This is done is 4 steps </p>
 * <ul>
 * 	<li>Step 1: Divide the array into 2 parts. First part is from 0 to d-1, 
 * 				second part is d to n-1. Where d is the number of rotations </li>
 * 	<li>Step 2: Reverse the first half of array </li>
 * 	<li>Step 3: Reverse the second half of array </li>
 * 	<li>Step 4: Reverse the whole array to get rotated array </li>
 * </ul>
 * 
 * @author Manjunath HM
 *
 */
public class ReversalAlgorithm {
	
	/**
	 * Method leftRotate to perform the array rotation by specified number
	 * 
	 * @param arr
	 *            Array to be rotated
	 * @param d
	 *            Numbers of rotations to be performed
	 */
	private void leftRotate(int[] arr, int d) {
		int n = arr.length;
		
		//perform reverse till 0 to d-1
		reverseArray(arr, 0, d-1);
		//perform reverse till d to n-1
		reverseArray(arr, d, n-1);
		
		//reverse whole array to get the rotated array
		reverseArray(arr, 0, n-1);
	}
	
	/**
	 * Method reverseArray to perform the reverse of the array. Array reverse
	 * will be performed by swapping the array elements.
	 * 
	 * @param arr
	 *            Input array for reversing
	 * @param start
	 *            Starting point/index from where reverse to be performed
	 * @param end
	 *            End point/index till where reverse to be performed
	 */
	private void reverseArray(int[] arr, int start, int end) {
		int temp;
		
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	/**
	 * Method printArray is used to print the array elements
	 * 
	 * @param arr
	 *            Array to be printed
	 */
	private void printArray(int[] arr) {
		for (int i = 0; i< arr.length; i++) 
			System.out.print(arr[i] +" ");
		
		System.out.println();
	}
	
	/**
	 * Method executeLeftRotate is used to rotate the array with specified
	 * number of rotations. It internally call different private methods to do
	 * the job
	 * 
	 * @param arr
	 *            Array to be rotated
	 * @param noOfRotations
	 *            Number of rotations to be performed
	 * @return Array after performing the rotations
	 */
	public int[] executeLeftRotate(int[] arr, int noOfRotations) {
		leftRotate(arr, noOfRotations);
		printArray(arr);
		
		return arr;
	}
}
