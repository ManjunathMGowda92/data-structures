package org.manjunath.datastructures.arrays;

/**
 * Class TopTwoMaximumAndMinimumOfArray is used to find the top 2max numbers and
 * top 2 minimum numbers inside the given input array.
 * 
 * The class contains 2 methods.
 * <ol>
 * 	<li><b>topTwoMaximum: </b>Which is used to find 2 max numbers from the given
 * 							  input array </li>
 * 	<li><b>topTwoMinimum: </b>Which is used to find 2 min numbers from the given
 * 							  input array </li>
 * </ol>
 * 
 * @author Manjunath HM
 *
 */
public class TopTwoMaximumAndMinimumOfArray {
	
	/**
	 * Method topTwoMaximum() used to fetch the top 2 maximum integers from the
	 * given input array. If the array length is less than 2 then it will return
	 * the Integer.MIN_VALUE for any one or two values of return array.
	 * 
	 * @param numbers
	 *            Input Array containing the Integers
	 * @return Array with top 2 maximum integers from array
	 */
	public int[] topTwoMaximum(int[] numbers) {
		//assign two integers with Integer.MIN_VALUE
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		//loop through the array and find the numbers which are greater than
		// max1 and max2
		for (int i = 0; i < numbers.length; i++) {
			//if the array element is greater than max1 then reassign the values
			if (numbers[i] > max1) {
				max2 = max1;
				max1 = numbers[i];
			} else if (numbers[i] > max2) {
				//if the array element is greater than the max2, then reassign the value
				max2 = numbers[i];
			}
		}
		
		//Create an empty array of length 2, to store the max1 and max2 elements
		int[] topTwo = new int[2];
		topTwo[0] = max1;
		topTwo[1] = max2;
		
		//return the array which contains top 2 max elements
		return topTwo;
	}
	
	/**
	 * Method topTwoMinimum() used to fetch the top 2 minimum integers from the
	 * given input array. If the array length is less than 2 then it will return
	 * the Integer.MAX_VALUE for any one or two values of return array.
	 * 
	 * @param numbers
	 *            Input Array containing the Integers
	 * @return Array with top 2 maximum integers from array
	 */
	public int[] topTwoMinimum(int[] numbers) {
		//assign two integers with Integer.MAX_VALUE
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		//loop through the array and find the numbers which are less than
		// min1 and min2
		for (int i = 0; i < numbers.length; i++) {
			//if the array element is less than min1 then reassign the values.
			if (numbers[i] < min1) {
				min2 = min1;
				min1 = numbers[i];
			} else if (numbers[i] < min2) {
				//if the array element is less than min2 then reassign the value.
				min2 = numbers[i];
			}
		}
		
		//create an empty array of length 2, to store the min1 and min2 elements
		int[] bottomTwo = new int[2];
		bottomTwo[0] = min1;
		bottomTwo[1] = min2;
		
		//return the array which contains the bottom 2 elements
		return bottomTwo;
	}
}
