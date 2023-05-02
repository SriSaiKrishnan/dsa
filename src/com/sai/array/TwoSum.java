package com.sai.array;

/*

Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

Examples:

Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

 */

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 15;
        if(twoSum(arr, target))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    private static boolean twoSum(int[] arr, int target) {

        boolean flag = false;

        for (int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length-1; j++)
            {
                if(arr[i] + arr[j] == target) {
                    flag = true;
                    break;
                }
            }
        }

        return flag;

    }

}
