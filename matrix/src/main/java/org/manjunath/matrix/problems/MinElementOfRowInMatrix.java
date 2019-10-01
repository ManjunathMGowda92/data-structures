package org.manjunath.matrix.problems;

/**
 * Class MinElementOfRowInMatrix do the task of find the minimum element of each
 * row
 * <p>
 * For Example: <blockquote>Input matrix is : [ { 5, 2, 3 }, { 3, 5, 2 }, { 7,
 * 47, 9 } ] <br>
 * Then expected output is [ 2, 2, 7 ]</blockquote>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class MinElementOfRowInMatrix {

	/**
	 * Method minRowElement() finds the min element in each row of Matrix and
	 * stores them into one array
	 * 
	 * @param arr
	 *            Input Matrix
	 * @param minRowElements
	 *            Array to store the min elements of each row
	 */
	private void minRowElement(int[][] arr, int[] minRowElements) {
		for (int i = 0; i < arr.length; i++) {
			int minElement = Integer.MAX_VALUE;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < minElement)
					minElement = arr[i][j];
			}
			minRowElements[i] = minElement;
		}
	}

	/**
	 * Method getMinElementFromEachRow() finds the minimum element from each
	 * row of the input matrix and stores them back to an array
	 * 
	 * @param arr
	 *            Input Matrix
	 * @return Array with minimum elements of each row of Matrix
	 */
	public int[] getMinElementFromEachRow(int[][] arr) {
		int[] minRowElements = new int[arr.length];
		minRowElement(arr, minRowElements);

		System.out.println("Print the input matrix::");
		printMatrix(arr);

		System.out.println("Print the minimum elements in each Row::");
		printSingleRow(minRowElements);

		return minRowElements;
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
