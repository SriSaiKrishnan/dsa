package com.sai.sorting;

/*

Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation:
After sorting the array is: 9,13,20,24,46,52


Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1,2,3,4,5

 */

public class InsertionSort {

    public static  int arr[] = {5,4,3,2,1};

    public static void main(String[] args) {
        insertionSort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

     }

    private static void insertionSort(int[] arr) {

        for (int i=1; i<arr.length; i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                swap(j,j-1);
                j--;
            }
        }

    }

    private static void swap(int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
