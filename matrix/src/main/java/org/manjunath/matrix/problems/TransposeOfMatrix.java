package org.manjunath.matrix.problems;

/**
 * Class TransposeOfMatrix is used to transpose the rectangular matrix. After
 * transpose the rows will be mapped as columns and vice versa
 * 
 * <p>
 * Ex: <br>
 * Input Matrix -> [ {1, 4, 3}, {2, 5, 4}, {3, 6, 5}] <br />
 * Output Matrix -> [{1, 2, 3}, {4, 5, 6}, {3, 4, 5}] }
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class TransposeOfMatrix {

	/**
	 * Method transpose() converts the input rectangular matrix to its
	 * transpose.
	 * 
	 * @param matrix
	 *            Input Rectangular Matrix
	 * @return Transposed Matrix
	 */
	private int[][] transpose(int[][] matrix) {
		int temp[][] = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				temp[j][i] = matrix[i][j];
			}
		}

		return temp;
	}

	/**
	 * Method printMatrix() accepts the matrix as input and prints it into the
	 * console
	 * 
	 * @param matrix
	 *            Matrix to print
	 */
	private void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	/**
	 * Method runner() is executable method, where it accepts the matrix as
	 * inputs and then it transpose and print the Matrix.
	 * 
	 * @param matrix
	 *            Input matrix
	 * @return Transposed Matrix
	 */
	public int[][] runner(int[][] matrix) {
		System.out.println("Before Transpose:: ");
		printMatrix(matrix);

		int temp[][] = transpose(matrix);

		System.out.println("After Transpose:: ");
		printMatrix(temp);

		return temp;
	}
}
