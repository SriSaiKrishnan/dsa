package com.sai.patterns;

public class Pattern21 {

    /*

Input Format: N = 3
Result:
***
* *
***

Input Format: N = 6
Result:
******
*    *
*    *
*    *
*    *
******

     */

    public static void main(String[] args) {
        int n=3;
        pattern21(n);
    }

    private static void pattern21(int n) {

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || i==(n-1) || j==0 || j==(n-1))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }

}
