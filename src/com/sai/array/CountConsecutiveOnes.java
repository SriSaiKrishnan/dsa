package com.sai.array;

/*

Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

Examples:

Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

 */

public class CountConsecutiveOnes {

    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 1, 0, 1};
        System.out.println(countOnes(arr));
    }

    private static int countOnes(int[] arr) {

        int max = 0;
        int cntr = 0;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] == 1)
                cntr ++;
            else if(max < cntr)
            {
                max = cntr;
                cntr = 0;
            }
            if(i==arr.length-1 && max<cntr)
            {
                max = cntr;
            }
        }
        return max;
    }

}
