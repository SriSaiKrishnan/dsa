package com.sai.patterns;

public class Pattern20 {

    /*

Input Format: N = 3
Result:
*    *
**  **
******
**  **
*    *


Input Format: N = 6
Result:
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *


     */

    public static void main(String[] args) {
        int n= 6;
        pattern20(n);
    }

    private static void pattern20(int n) {

        int space = 2*n-2;
        int stars = 0;
        for(int i=1; i<=2*n-1; i++)
        {
            if(i<=n)
                stars = i;
            else
                stars = 2*n - i;

            for (int j=1; j<=stars; j++)
            {
                System.out.print("*");
            }

            for (int j=0; j<space; j++)
            {
                System.out.print(" ");
            }

            for (int j=1; j<=stars; j++)
            {
                System.out.print("*");
            }

            System.out.println();
            if(i<n)
                space -=2;
            else
                space +=2;

        }

    }

}
