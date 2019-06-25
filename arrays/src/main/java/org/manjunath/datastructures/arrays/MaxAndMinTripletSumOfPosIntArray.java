package org.manjunath.datastructures.arrays;

/**
 * Class MaxAndMinTripletSumOfPosIntArray is used to find the max triplet sum
 * and min triplet sum of from the given Integer Array
 * 
 * The class contains 2 methods
 * <ol>
 * 	<li><b>maxTripletSum: </b>Which is used to find the max triplet sum from the 
 * 							  given input array</li>
 * 	<li><b>maxTripletSum: </b>Which is used to find the min triplet sum from the 
 * 							  given input array</li>
 * </ol>
 * 
 * @author Manjunath HM
 *
 */
public class MaxAndMinTripletSumOfPosIntArray {
	
	/**
	 * Method maxTripletSum() is used to find out the max triplet sum from the
	 * given input integer array.
	 * 
	 * @param numbers
	 *            Input Array containing Integers
	 * @return Integer which is sum of max triplets
	 */
	public int maxTripletSum(int[] numbers) {
		// Assign 3 integers with values Integer.MIN_VALUE (i.e max1, max2 and max3)
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		
		//loop through the array and find out the max triplets
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] > max1) {
				//if the array element is greater than the max1, then reassign the values
				max3 = max2;
				max2 = max1;
				max1 = numbers[i];
			} else if (numbers[i] > max2) {
				//if the array element is greater than the max2, then reassign the values
				max3 = max2;
				max2 = numbers[i];
			} else if (numbers[i] > max3) {
				//if the array element is greater than the max3, then reassign the values
				max3= numbers[i];
			}
		}
		
		//return the sum of max triplets
		return (max1 == Integer.MIN_VALUE ? 0 : max1) + (max2 == Integer.MIN_VALUE ? 0 : max2)
				+ (max3 == Integer.MIN_VALUE ? 0 : max3);
	}

	/**
	 * Method minTripletSum() is used to find out the min triplet sum from the
	 * given input integer array
	 * 
	 * @param numbers
	 *            Input Array containing the Integers
	 * @return Integer which is min triplet sum
	 */
	public int minTripletSum(int[] numbers) {
		//Assign 3 integers with Integer.MAX_VALUE
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

		//loop through the array and find out the min triplets 
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] < min1) {
				//if the array element is less than the min1, then reassign the values
				min3 = min2;
				min2 = min1;
				min1 = numbers[i];
			} else if (numbers[i] < min2) {
				//if the array element is less than the min2, then reassign the values
				min3 = min2;
				min2 = numbers[i];
			} else if (numbers[i] < min3) {
				//if the array element is less than the min3, then reassign the values
				min3 = numbers[i];
			}
		}

		//return the min triplet sum
		return (min1 == Integer.MAX_VALUE ? 0 : min1) + (min2 == Integer.MAX_VALUE ? 0 : min2)
				+ (min3 == Integer.MAX_VALUE ? 0 : min3);
	}
	
	
	public static void main(String[] args) {
		MaxAndMinTripletSumOfPosIntArray a = new MaxAndMinTripletSumOfPosIntArray();
		
		int[] arr = {10, 85, -35, 98, 23, 15, -12, -36, 96, 16};
		
		System.out.println(a.maxTripletSum(arr));
		System.out.println(a.minTripletSum(arr));
	}
}
