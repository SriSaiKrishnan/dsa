package com.sai.patterns;

/*
Input
n=5

Output
 *********
  *******
   *****
    ***
     *

 */

public class Pattern8 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

    private static void pattern(int n) {
        int k=1;
        int m=1;
       for( int i=n; i>0; i--)
       {
           //Space
           for (int j=m; j<k;j++)
           {
               System.out.print(" ");
           }
           //Star
           for(int j=0; j< 2*n-k; j++)
           {
               System.out.print("*");
           }
           //Space
           for (int j=m; j<k;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
           k+=2;
           m+=1;
       }

    }

}
