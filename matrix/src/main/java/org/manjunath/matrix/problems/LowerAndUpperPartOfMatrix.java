package org.manjunath.matrix.problems;

/**
 * Class <i>LowerAndUpperPartOfMatrix</i> is a matrix problem, where either the
 * lower and upper triangular parts will be printed.
 * 
 * <p>
 * <ul>
 * <li>Lower triangular matrix is a matrix which contain elements below
 * principle diagonal including principle diagonal elements and rest of the
 * elements are 0.</li>
 * <li>Upper triangular matrix is a matrix which contain elements above
 * principle diagonal including principle diagonal elements and rest of the
 * elements are 0</li>
 * </ul>
 * </p>
 * 
 * For Example:
 * <p>
 * Lower Triangular Matrix: <blockquote> input matrix [ {1, 2, 3}, {4, 5, 6},
 * {7, 8, 9} ] <br/>
 * output matrix [ { 1, 0, 0}, {4, 5, 0}, {7, 8, 9} ]</blockquote>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class LowerAndUpperPartOfMatrix {

	/**
	 * Method getLowerPart() used to get the lower part of the square matrix.
	 * The elements which are above the principle diagonal will be reset to zero
	 * 
	 * @param matrix
	 *            Square Matrix of order n (where order is > 2)
	 * @param order
	 *            Order of the matrix
	 */
	private void getLowerPart(int[][] matrix, int order) {
		for (int i = 0; i < order; i++) {
			for (int j = 0; j < order; j++) {
				if (i < j) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	/**
	 * Method getLowerPart() used to get the lower part of the square matrix.
	 * The elements which are above the principle diagonal will be reset to
	 * zero.
	 * 
	 * @param matrix
	 *            Square Matrix of Order n (where n > 2)
	 * @return Matrix with only lower part.
	 */
	public int[][] getLowerPart(int[][] matrix) {
		getLowerPart(matrix, matrix.length);
		printMatrix(matrix);
		return matrix;
	}

	/**
	 * Method getUpperPart() used to get the upper part of the square matrix.
	 * The elements which are below the principle diagonal will be reset to zero
	 * 
	 * @param matrix
	 *            Square Matrix of order n (where order is > 2)
	 * @param order
	 *            Order of the matrix
	 */
	private void getUpperPart(int[][] matrix, int order) {
		for (int i = 0; i < order; i++) {
			for (int j = 0; j < order; j++) {
				if (i > j) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	/**
	 * Method getUpperPart() used to get the upper part of the square matrix.
	 * The elements which are below the principle diagonal will be reset to
	 * zero.
	 * 
	 * @param matrix
	 *            Square Matrix of Order n (where n > 2)
	 * @return Matrix with only lower part.
	 */
	public int[][] getUpperPart(int[][] matrix) {
		getUpperPart(matrix, matrix.length);
		printMatrix(matrix);
		return matrix;
	}

	/**
	 * Method printMatrix() is used to print the matrix
	 * 
	 * @param matrix
	 *            Input Matrix
	 */
	public void printMatrix(int[][] matrix) {
		int order = matrix.length;

		for (int i = 0; i < order; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
