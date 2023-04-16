package com.sai.sorting;

/*

Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52


Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5

 */

public class BubbleSort {

    public static int arr[] = {5,4,3,2,1};
    
    public static void main(String[] args) {
        bubbleSort();
        for( int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort() {

        for(int i=arr.length-1; i>=1; i--)
        {
            for (int j=0; j<=i-1; j++)
            {
                if(arr[j]>arr[j+1])
                    swap(j, j+1);
            }
        }

    }

    private static void swap(int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
