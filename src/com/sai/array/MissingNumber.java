package com.sai.array;

/*

Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

Examples:

Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

 */

public class MissingNumber {

    public static void main(String[] args) {
        int n=3;
        int arr[] = {1,3};
        System.out.println(missingNumber(n,arr));
    }

    private static int missingNumber(int n, int[] arr) {

        int i=1;
        int num = 0;
        for (int j=0; j<arr.length; j++)
        {
            if(arr[j]!=i)
            {
                num = i;
                break;
            }
            i++;
        }
        return num;
    }

}
