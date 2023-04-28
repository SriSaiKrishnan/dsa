package com.sai.array;

/*
The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

Examples:

Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
 {1,2,3,4,5}

 */

import java.util.Arrays;

public class UnionOfTwoSortedArray {

    public static int temp[];
    public static int cntr;

    public static void main(String[] args) {
        int[] arr1 = {5,2,3,4,4};
        int[] arr2 = {2,3,4,4,1};
        union(arr1, arr2);
        //Arrays.sort(temp);
        for (int i=0; i<temp.length; i++)
        {
            System.out.print(temp[i] + " ");
        }
    }

    private static void union(int[] arr1, int[] arr2) {

        if(arr1.length == arr2.length)
        {
             temp = new int[arr1.length];

            for (int i=0; i<arr1.length; i++)
            {
                if(!searchele(arr1[i]))
                    temp[cntr++] = arr1[i];
            }

            for (int i=0; i<arr2.length; i++)
            {
                if(!searchele(arr2[i]))
                    temp[cntr++] = arr2[i];
            }

        }

    }

    private static boolean searchele(int ele) {

        boolean flag = false;

        for (int i=0; i<temp.length; i++)
        {
            if(temp[i] == ele)
                flag = true;
        }

        return flag;

    }
}
