package com.sai.recursion;

/*

Problem Statement: You are given an array. The task is to reverse the array and print it.

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

 */

public class ReverseAnArray {

    public static int a[];
    public static int counter=0;

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int len = arr.length;
        a = new int[len];
        reverseArray(arr,len);
        for (int i : a)
        {
            System.out.print(i + " ");
        }
    }

    private static int[] reverseArray(int[] arr, int len) {

        if(len<=0)
            return a;

        a[counter] = arr[len-1];
        counter++;
        return reverseArray(arr, --len);

    }

}
