package org.manjunath.matrix.problems;

/**
 * Class MaxElementOfRowInMatrix do the task of find the maximum element of each
 * row
 * <p>
 * For Example: <blockquote>Input matrix is : [ { 5, 2, 3 }, { 3, 5, 2 }, { 7,
 * 47, 9 } ] <br>
 * Then expected output is [ 5, 5, 47 ]</blockquote>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class MaxElementOfRowInMatrix {

	/**
	 * Method maxRowElement() finds the max elements in each row of Matrix and
	 * stores them into one array
	 * 
	 * @param arr
	 *            Input Matrix
	 * @param maxRowElements
	 *            Array to store the max elements of each row
	 */
	private void maxRowElement(int[][] arr, int[] maxRowElements) {
		for (int i = 0; i < arr.length; i++) {
			int maxElement = Integer.MIN_VALUE;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maxElement)
					maxElement = arr[i][j];
			}
			maxRowElements[i] = maxElement;
		}
	}

	/**
	 * Method getMaxElementFromEachRow() finds the maximum elements from each
	 * row of the input matrix and stores them back to an array
	 * 
	 * @param arr
	 *            Input Matrix
	 * @return Array with maximum elements of each row of Matrix
	 */
	public int[] getMaxElementFromEachRow(int[][] arr) {
		int[] maxRowElements = new int[arr.length];
		maxRowElement(arr, maxRowElements);

		System.out.println("Print the input matrix::");
		printMatrix(arr);

		System.out.println("Print the max elements in each Row::");
		printSingleRow(maxRowElements);

		return maxRowElements;
	}

	/**
	 * Method printMatrix() prints 2-dimensional array
	 * 
	 * @param arr
	 *            Input Matrix for printing
	 */
	private void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Method printSingleRow() prints a single dimensional array
	 * 
	 * @param arr
	 */
	private void printSingleRow(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
