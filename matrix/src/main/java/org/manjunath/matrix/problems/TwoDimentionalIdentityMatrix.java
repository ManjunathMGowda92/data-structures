package org.manjunath.matrix.problems;

/**
 * Class <i>TwoDimentionalIdentityMatrix</i> is used to check if the
 * 2-Dimensional matrix is a Identity Matrix or not
 * 
 * @author Manjunath HM
 *
 */
public class TwoDimentionalIdentityMatrix {

	/**
	 * Method isMatrixSquareMatrix() verifies the input matrix is a square
	 * matrix or not.
	 * 
	 * @param arr
	 *            Input Matrix
	 * @return True is the input matrix is Square matrix, else false
	 */
	private boolean isMatrixSquareMatrix(int[][] arr) {
		int length = arr.length;
		boolean isSquareMatrix = true;

		for (int i = 0; i < arr.length; i++) {
			int column = arr[i].length;
			if (length != column) {
				isSquareMatrix = false;
				break;
			}
		}

		return isSquareMatrix;
	}

	/**
	 * Method isMatrixIsIdentity() verifies whether the input matrix is Identity
	 * Matrix or Not.
	 * 
	 * @param arr
	 *            Input Matrix
	 * @return True if input matrix is identity matrix, else false
	 */
	private boolean isMatrixIsIdentity(int[][] arr) {
		boolean isIdentity = false;

		outer: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					if (arr[i][j] == 1)
						isIdentity = true;
					else {
						isIdentity = false;
						break outer;
					}
				} else {
					if (arr[i][j] != 0) {
						isIdentity = false;
						break outer;
					}
				}
			}
		}

		return isIdentity;
	}

	/**
	 * Method isMatrixIsIdentityOrNot() checks whether the given input matrix is
	 * Identity Matrix or Not. This method works only for 2 dimensional square
	 * matrix. If the input matrix is not a 2-Dimensional square matrix then it
	 * will throw a <b>RuntimeException</b> saying <b>"Given Matrix is not a
	 * Square Matrix"</b>
	 * 
	 * @param arr
	 *            Input Matrix
	 * @return True if the Matrix is identity matrix. <br>
	 *         false if the matrix is not an Identity matrix. <br>
	 *         RuntimeException if the matrix is not square matrix
	 */
	public boolean isMatrixIsIdentityOrNot(int[][] arr) {
		if (isMatrixSquareMatrix(arr)) {
			return isMatrixIsIdentity(arr);
		} else {
			throw new RuntimeException("Given Matrix is not a Square Matrix");
		}
	}
}
