package org.manjunath.datastructures.arrays.rotations;

/**
 * Class ArrayRotation is used to rotate the Array. Either the rotation is left
 * rotation and right rotation
 * 
 * The class contains the execute methods for left and right rotations
 * <ol>
 * 	<li><b>executeLeftRotate: </b> Used to do the left shift rotation for the array</li>
 *  <li><b>executeLeftRotate: </b> Used to do the right shift rotation for the array</li>
 * 
 * @author Manjunath HM
 *
 */
public class ArrayRotation {

	/**
	 * Method leftRotate() is used to rotate the input array(left array shift),
	 * through number of rotations specified.
	 * 
	 * @param arr
	 *            Input array with Integers
	 * @param rotationNum
	 *            Numbers of Rotations to be performed for the array
	 * @param sizeOfArray
	 *            Size of input array
	 */
	public void leftRotate(int[] arr, int rotationNum, int sizeOfArray) {
		for (int i = 0; i < rotationNum; i++)
			rotateLeftByOne(arr, sizeOfArray);
	}

	private void rotateLeftByOne(int[] arr, int sizeOfArray) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < sizeOfArray - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/**
	 * Method executeLeftRotate() is used to execute the leftRotate method. This method
	 * internally call the leftRotate method and returns the rotated array
	 * 
	 * @param arr
	 *            Input array for rotation
	 * @param rotationNum
	 *            Number of rotations to be performed
	 * @return Output array after the rotation
	 */
	public int[] executeLeftRotate(int[] arr, int rotationNum){
		leftRotate(arr, rotationNum, arr.length);
		printArray(arr);
		
		return arr;
	}
	
	
	/**
	 * Method rightRotate() is used to rotate the input array(right shift),
	 * through number of rotations specified.
	 * 
	 * @param arr
	 *            Input array with Integers
	 * @param rotationNum
	 *            Numbers of Rotations to be performed for the array
	 * @param sizeOfArray
	 *            Size of input array
	 */
	public void rightRotate(int[] arr, int rotationNum, int sizeOfArray) {
		for (int i = 0; i < rotationNum; i++)
			rotateRightByOne(arr, sizeOfArray);
	}
	
	private void rotateRightByOne(int[] arr, int sizeOfArray) {
		int i, temp;
		temp = arr[sizeOfArray - 1];
		for (i = sizeOfArray - 2; i >= 0 ; i--)
			arr[i+1] = arr[i];
		arr[0] = temp;
	}
	
	/**
	 * Method executeRightRotate() is used to execute the rightRotate method.
	 * This method internally call the rightRotate method and returns the
	 * rotated array
	 * 
	 * @param arr
	 *            Input array for rotation
	 * @param rotationNum
	 *            Number of rotations to be performed
	 * @return Output array after the rotation
	 */
	public int[] executeRightRotate(int[] arr, int rotationNum) {
		rightRotate(arr, rotationNum, arr.length);
		//printArray(arr);
		
		return arr;
	}

	/*public static void main(String[] args) {
		ArrayRotation rotation = new ArrayRotation();
		
		//left shift
		//2, 3, 4, 5, 6, 1 (first rotation)
		//3, 4, 5, 6, 1, 2 (second rotation)
		//4, 5, 6, 1, 2, 3 (third rotation)
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		rotation.executeLeftRotate(arr, 4);
		
		
		System.out.println();
		//right shift
		//6, 1, 2, 3, 4, 5 (first rotation)
		//5, 6, 1, 2, 3, 4 (second rotation)
		//4, 5, 6, 1, 2, 3 (third rotation)
		//3, 4, 5, 6, 1, 2 (fourth rotation)
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		rotation.executeRightRotate(arr2, 4);
	}*/
}
