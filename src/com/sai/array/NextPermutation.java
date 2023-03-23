package com.sai.array;

import java.util.Arrays;

public class NextPermutation {

    public static int[] arr = {1,3,2};

    public static void main(String[] args) {
        nextPermutation(arr);
    }

    private static void nextPermutation(int[] arr) {

        int a[] = new int[arr.length];
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++)
            {
                a[i] = arr[i];
            }
        for (int i=0; i<a.length; i++)
            {
                a = swapArrayElements(a,i);
            }

    }

    private static int[] swapArrayElements(int[] a, int i) {
        if(i==0)
        {
            a[i+1] = arr[i+2];
            a[i+2] = arr[i+1];
        }
        if(i==1)
        {
            a[i-1] = arr[i+1];
            a[i+1] = arr[i-1];
        }
        if(i==0)
        {
            a[i+1] = arr[i+2];
            a[i+2] = arr[i+1];
        }
        return a;
    }

}
