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
        int n = 6;
        pattern19(n);
    }

    private static void pattern19(int n) {

        for(int i=0; i<2*n; i++)
        {
           for(int j=0; j<2*n; j++)
           {
               System.out.print("*");
           }
            System.out.println();
        }

    }

}
