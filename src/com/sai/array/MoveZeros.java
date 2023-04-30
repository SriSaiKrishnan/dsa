package com.sai.array;

/*

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Examples:

Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order


 */

public class MoveZeros {

    public static void main(String[] args) {

        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZeros(arr);

        for( int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

    private static void moveZeros(int[] arr) {

        int j=0;

        for( int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[j] = arr[i];
                j++;
            }
        }

        for( int k=j; k<arr.length; k++)
        {
            arr[k] = 0;

        }

    }

}
