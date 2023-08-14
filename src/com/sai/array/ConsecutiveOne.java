package com.sai.array;

/*

Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

Examples:

Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1}

Output: 2

Explanation: There are two consecutive 1's in the array.

 */

public class ConsecutiveOne {

    public static void main(String[] args) {

        int arr[] = {1, 1, 0, 1, 1, 1};

        System.out.println(maximumConsecutiveOnes(arr));

    }

    private static int maximumConsecutiveOnes(int[] arr) {

        int count = 0;
        int max = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] == 1)
                count++;
            else
                count = 0;

            if(count > max)
                max = count;

        }

        return max;

    }

}
