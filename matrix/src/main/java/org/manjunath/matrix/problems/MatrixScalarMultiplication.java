package org.manjunath.matrix.problems;

/**
 * Scalar multiplication of a matrix means multiplying the each element of
 * matrix with the provided scalar value
 * 
 * <p>
 * For Example: <blockquote> Input Matrix is [ { 2, 4 }, { 5, 6 } ] </br>
 * 
 * Scalar value k is 5 </br>
 * 
 * Output matrix (if multiplied by scalar value ) is [ { 10, 20 }, { 25, 30 } ]
 * </blockquote>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class MatrixScalarMultiplication {

	/**
	 * Method scalarMultiply() multiplies the each element of matrix with
	 * provided scalar value
	 * 
	 * @param arr
	 *            Input Matrix
	 * @param scalarValue
	 *            Scalar value to be multiplied for matrix
	 */
	private void scalarMultiply(int[][] arr, int scalarValue) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scalarValue * arr[i][j];
			}
		}
	}

	/**
	 * Method printMatrix() prints the input matrix
	 * 
	 * @param arr
	 *            Input Matrix
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
	 * Method executeScalarMultiplication() performs the multiplication of
	 * matrix with the scalar value. And after the scalar multiplication it
	 * prints the matrix to console
	 * 
	 * @param arr
	 *            Input Matrix
	 * @param scalarValue
	 *            Scalar value to be multiplied for matrix
	 * @return Matrix after the scalar multiplication
	 */
	public int[][] executeScalarMultiplication(int[][] arr, int scalarValue) {
		scalarMultiply(arr, scalarValue);
		printMatrix(arr);

		return arr;
	}
}
