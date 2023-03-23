package com.sai.patterns;

/*

Input: 5

Output:

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

 */

public class Pattern10 {

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

    private static void pattern(int n) {
        int k=0;
        for (int i=0; i<2*n; i++)
        {
            for(int j=0; j<=k; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i>=4)
               k--;
            else
                k++;
        }

    }

}
