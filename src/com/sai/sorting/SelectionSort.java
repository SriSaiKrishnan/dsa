package com.sai.sorting;

/*

Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5

 */

public class SelectionSort {

    public static int arr[] = {13,46,24,52,20,9};

    public static void main(String[] args) {
        selectionSort();
        for (int i=0; i<arr.length; i++ )
        {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort() {

        for( int i=0; i<arr.length-1; i++)
        {
            int min = i;

            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(i,min);
        }

    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
