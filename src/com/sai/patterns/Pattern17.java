package com.sai.patterns;

public class Pattern17 {

    /*

Input Format: N = 3
Result:
  A
 ABA
ABCBA


Input Format: N = 6
Result:
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA


     */

    public static void main(String[] args) {
        int n = 6;
        pattern17(n);
    }

    private static void pattern17(int n) {
    for (int i=0; i<n; i++)
    {

       for( int j=0; j<n-i-1; j++)
       {
           System.out.print(" ");
       }

       for (int j=0; j<(2*i+1); j++)
       {
           System.out.print("*");
       }
       for( int j=0; j<n-i-1; j++)
       {
           System.out.print(" ");
       }

        System.out.println();
    }

    }

}
