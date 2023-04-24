package com.sai.array;

/*

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

 */

public class CheckIfArraySorted {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(checkSorted(arr));
    }

    private static boolean checkSorted(int[] arr) {

        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;

    }

}
