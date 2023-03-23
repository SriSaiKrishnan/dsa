package com.sai.patterns;

/*

Input: 5

Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

public class Pattern3 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

    private static void pattern(int n) {
        int arr[][] = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = j+1;
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
