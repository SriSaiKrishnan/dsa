package com.sai.array;

/*

Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

Note: Rotate matrix 90 degrees anticlockwise

Examples:

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]

Output: [[7,4,1],[8,5,2],[9,6,3]]

1 2 3      7 4 1  -6 -2 2
4 5 6  ->  8 5 2  -4  0 4
7 8 9      9 6 3  -2  2 6

Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.

 */

public class RotateMatrix {

    public static void main(String[] args) {
        int arr[][] = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        rotateMatrix(arr);
    }

    private static void rotateMatrix(int[][] arr) {

        int a[][] = new int[arr.length][arr[0].length];


        for(int i=0; i<arr.length; i++)
        {
            int k=0;
            for(int j=arr.length-1; j>=0; j--)
            {
                a[i][k++] = arr[j][i];
            }
        }

        for (int i=0; i< arr.length; i++)
        {
            for (int j=0; j< arr.length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
