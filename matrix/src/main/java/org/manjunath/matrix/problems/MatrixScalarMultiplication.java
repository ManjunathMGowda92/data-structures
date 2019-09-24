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

	public void scalarMultiply(int[][] arr, int scalarValue) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scalarValue * arr[i][j];
			}
		}
	}

	public void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
