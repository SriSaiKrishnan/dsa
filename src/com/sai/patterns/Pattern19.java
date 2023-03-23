package com.sai.patterns;

public class Pattern19 {

    /*

Input Format: N = 3
Result:
******
**  **
*    *
*    *
**  **
******

Input Format: N = 6
Result:
************    0
*****  *****    2
****    ****    4
***      ***    6
**        **    8
*          *    10
*          *    10
**        **    8
***      ***    6
****    ****    4
*****  *****    2
************    0

     */

    public static void main(String[] args) {
        int n = 8;
        pattern19(n);
    }

    private static void pattern19(int n) {

        int iniS = 0;
        for(int i=0; i<n; i++)
        {
           for(int j=0; j<n-i; j++)
           {
               System.out.print("*");
           }

           for (int j=0; j<iniS; j++)
           {
               System.out.print(" ");
           }

           for (int j=0; j<n-i; j++)
           {
               System.out.print("*");
           }
           iniS += 2;
           System.out.println();
        }
        iniS -= 2;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            for (int j=0; j<iniS; j++)
            {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }

    }

}
