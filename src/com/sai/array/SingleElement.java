package com.sai.array;

/*

Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

Examples:

Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

 */

public class SingleElement {

    public static void main(String[] args) {
        int arr[] = {2,3,2,5,1,1,3};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] arr) {

        int ar[] = new int[arr.length];
        int num = 0;

        for (int i=0; i<arr.length; i++)
        {
           ar[arr[i]] = ar[arr[i]] +1;
            if (ar[arr[i]] == 1)
                num = arr[i];
            }
        for (int i=0; i<ar.length; i++)
        {
            if(ar[i] == 1)
                num = i;
        }
        return num;
    }



}
