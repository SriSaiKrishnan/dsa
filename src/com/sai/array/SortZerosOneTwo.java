package com.sai.array;

/*

Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Input: nums = [0]

 */

public class SortZerosOneTwo {

    public static void main(String[] args) {
        int arr[] = { 0 };
        sort(arr);
    }

    private static void sort(int[] arr) {

        int a=0;
        int b=0;
        int c=0;

        for (int i=0; i< arr.length; i++)
        {
            if(arr[i] == 0)
                a++;
            else if(arr[i] == 1)
                b++;
            else if(arr[i] == 2)
                c++;
        }

        for (int i=0; i<arr.length; i++)
        {
            if(a>0)
            {
                arr[i] = 0;
                a--;
                continue;
            }
            if(b>0)
            {
                arr[i] = 1;
                b--;
                continue;
            }
            if(c>0)
            {
                arr[i] = 2;
                c--;
                continue;
            }
        }

        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

}
