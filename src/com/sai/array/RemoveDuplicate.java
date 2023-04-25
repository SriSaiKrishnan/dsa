package com.sai.array;

/*

Examples:

Example 1:

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

 */

public class RemoveDuplicate {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,4,4,4,4};
        int i = removeDuplicate(arr);
        for (int j=0; j<i; j++)
        {
            System.out.print(arr[j] + " ");
        }

    }

    private static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

}
