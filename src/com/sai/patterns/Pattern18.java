package com.sai.patterns;

public class Pattern18 {

    /*

Input Format: N = 3
Result:
C
B C
A B C

Input Format: N = 6
Result:
F
E F
D E F
C D E F
B C D E F
A B C D E F

     */

    public static void main(String[] args) {

        int n = 3;
        pattern18(n);

    }

    private static void pattern18(int n) {
        char ch = 'A';
        int unicode = (int)ch;
        unicode = unicode + (n-1);
        ch = (char)unicode;

        for( int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(ch++ + " ");
            }
            unicode = unicode - 1;
            ch = (char)unicode;
            System.out.println();
        }
    }

}
