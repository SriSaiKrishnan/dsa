package com.sai.patterns;

/*

Input: 5

Output:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */

public class Pattern6 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

    private static void pattern(int n) {
        int arr[][] = new int[n][n];
        int k=n;
        for(int i=0; i<n; i++)
        {
            for (int j=0; j<k; j++)
            {
                arr[i][j] = j+1;
            }
            --k;
        }
        k=n;
        for(int i=0; i<n; i++)
        {
            for (int j=0; j<k; j++)
            {
                System.out.print(arr[i][j]);
            }
            --k;
            System.out.println();
        }
    }

}
