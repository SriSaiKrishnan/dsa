package com.sai.array;

/*

Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples:

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

 */

public class SecondLargestElement {

    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        System.out.println(secondLarge(arr));
    }

    private static int secondLarge(int[] arr) {

        if(arr.length<2)
            return -1;

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for( int i=0; i<arr.length; i++)
        {
            if(arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
    return second_large;
    }

}
