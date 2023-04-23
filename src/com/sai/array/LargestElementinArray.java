package com.sai.array;

/*

Problem Statement: Given an array, we have to find the largest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array.

Example2:
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LargestElementinArray {

    public static void main(String[] args) {
        int arr[] = { 2,5,1,3,0 };
        sortArray(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
    }

    public static void sortArray(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sortArray(arr, left, mid);
            sortArray(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k = left; k <= right; k++) {
            arr[k] = temp[k];
        }
    }

}
