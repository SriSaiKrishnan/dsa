package com.sai.array;

/*

Problem Statement: Find the intersection of two sorted arrays. OR in other words, Given 2 sorted arrays, find all the elements which occur in both the arrays.

Examples:

Example 1:
Input:
A: [1 2 3 3 4 5 6]
, B: [3 3 5]
Output: 3,3,5
Explanation: We are given two arrays A and B.
The elements present in both the arrays
are 3,3 and 5.

 */

public class IntersectionOfTwoSortedArray {

    public static int[] temp;

    public static void main(String[] args) {
        int arr1[] = {1,2,3,3,4,5,6};
        int arr2[] = {3,3,4,4,5,};
        int len = intersect(arr1,arr2);
        for (int i=0; i<len; i++)
        {
            System.out.print(temp[i] + " ");
        }
    }

    private static int intersect(int[] arr1, int[] arr2) {

        int largeLen= arr1.length > arr2.length ? arr1.length : arr2.length;
        int smallLen = arr1.length < arr2.length ? arr1.length : arr2.length;
        temp = new int[largeLen];
        int cntr = 0;

        for(int i=0; i<largeLen; i++)
        {
            if(arr1[i] == arr2[cntr])
            {
                temp[cntr] = arr2[cntr];
                cntr++;
                if(smallLen == cntr)
                    break;
            }
        }
        return smallLen;
    }

}
