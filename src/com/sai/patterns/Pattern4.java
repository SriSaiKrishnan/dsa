package com.sai.patterns;

/*

Input: 5

Output:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */

public class Pattern4 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

    private static void pattern(int n) {
        int arr[][] = new int[n][n];
        for (int i=0; i<n; i++) {
            int k = i+1;
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = k;
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
