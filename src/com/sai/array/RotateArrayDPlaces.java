package com.sai.array;

/*

Problem Statement: Given an array of N integers and an integer D, left rotate the array by D place.

Pre-requisite: Left Rotate the Array by One

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , d = 3
Output: 4 5 6 7 1 2 3
Explanation: The array is rotated to the left by 3 positions.

 */

public class RotateArrayDPlaces {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 3;
        for(int i=0; i<d; i++)
        {
            rotateArray(arr,d);
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArray(int[] arr, int d) {

        int firstele = arr[0];

        for (int i=0; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = firstele;

    }

}
