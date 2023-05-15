package com.sai.array;

/*

Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.

A subarray is a contiguous non-empty sequence of elements within an array.

Pre-requisite: Longest subarray with given sum

Examples:

Example 1:
Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
Result: 2
Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].

 */

public class SubArrayEqualsK {

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        int k=6;
        System.out.println(subArray(arr,k));
    }

    private static int subArray(int[] arr, int k) {

        int count=0;

        for(int i=0; i<arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {

                    sum += arr[j];

                if (sum == k)
                    count++;
            }

        }
        return count;
    }

}

