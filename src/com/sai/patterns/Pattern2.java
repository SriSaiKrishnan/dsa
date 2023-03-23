package com.sai.patterns;

/*

Input: 5

Output:
*
* *
* * *
* * * *
* * * * *

 */

public class Pattern2 {

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    private static void pattern(int n) {
        String arr[][] = new String[n][n];

        for (int i=0; i<n; i++)
        {
            for(int j=0; j<i+1; j++)
            {
                arr[i][j] = "* ";
            }
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

}
