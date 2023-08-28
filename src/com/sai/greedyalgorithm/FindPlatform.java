package com.sai.greedyalgorithm;

/*

 Problem Statement: We are given two arrays that represent the arrival and departure times of trains that stop at the platform. We need to find the minimum number of platforms needed at the railway station so that no train has to wait.

Examples 1:

Input: N=6,
arr[] = {9:00, 9:45, 9:55, 11:00, 15:00, 18:00}
dep[] = {9:20, 12:00, 11:30, 11:50, 19:00, 20:00}

Output:3

 */

import java.util.Arrays;

public class FindPlatform {

    public static void main(String[] args) {
        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        int n=arr.length;
        int totalCount=countPlatforms(n,arr,dep);
        System.out.println("Minimum number of Platforms required "+totalCount);
    }

    private static int countPlatforms(int n, int[] arr, int[] dep) {

        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1;
        int j = 0;

        int platform = 1;
        int result = 1;

        while(i < n && j < n)
        {
            if(arr[i] <= dep[j])
            {
                platform++;
                i++;
            }
            else if(arr[i] > dep[j]){
                platform--;
                j++;
            }

            if(platform > result)
                result = platform;
        }
        return result;
    }

}
