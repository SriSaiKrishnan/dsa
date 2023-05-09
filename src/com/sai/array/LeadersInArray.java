package com.sai.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeadersInArray {

    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 0};
        leaderInArray(arr);
    }

    private static void leaderInArray(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<arr.length-1; i++)
        {
            boolean great = true;

            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    great = false;
                    break;
                }
            }
            if(great)
            {
                set.add(arr[i]);
            }
            set.add(arr[arr.length-1]);
        }
        System.out.println(set);
    }

}
