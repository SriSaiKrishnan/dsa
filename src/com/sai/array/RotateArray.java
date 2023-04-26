package com.sai.array;

/*

Problem Statement: Given an array of N integers, left rotate the array by one place.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation:
Since all the elements in array will be shifted
toward left by one so ‘2’ will now become the
first index and and ‘1’ which was present at
first index will be shifted at last.

 */

public class RotateArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        rotateArrayByOne(arr);

        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }

    private static void rotateArrayByOne(int[] arr) {

        int firstele = arr[0];

        for (int i=0; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = firstele;

    }

}
