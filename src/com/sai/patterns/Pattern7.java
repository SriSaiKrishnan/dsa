package com.sai.patterns;

/*

Input: 5

Output:
    *
   ***
  *****
 *******
*********

 */

public class Pattern7 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

    private static void pattern(int n) {

        for(int i=0; i<n; i++)
        {
            //Space
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //Star
            for (int j=0; j<(2*i+1); j++)
            {
                System.out.print("*");
            }
            //Space
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
