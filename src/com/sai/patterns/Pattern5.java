package com.sai.patterns;

/*

Input: 5

Output:
* * * * *
* * * *
* * *
* *
*

 */

public class Pattern5 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

    private static void pattern(int n) {
        String arr[][] = new String[n][n];
        int k=n;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<k; j++)
            {
                arr[i][j] = "* ";
            }
            --k;
        }
        k=n;
        for (int i=0; i<n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(arr[i][j]);
            }
            --k;
            System.out.println();
        }
    }

}
