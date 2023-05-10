package com.sai.array;

public class MaximumSubarray {

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(arr));
    }

    private static int maximumSubarray(int[] arr) {
        int len = arr.length;
        int sum=0;
        int max=0;

        for (int i=0; i<arr.length; i++)
        {
            for(int k=len; k>0; k--)
            {
                for(int j=i; j<k; j++)
                {
                    sum += arr[j];
                }
                max = Math.max(sum,max);
                sum=0;
                len--;
            }
            len = arr.length;
        }
        return max;
    }

}
