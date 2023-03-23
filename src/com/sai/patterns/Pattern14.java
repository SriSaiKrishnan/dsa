package com.sai.patterns;

public class Pattern14 {

    /*

Input Format: N = 3
Result:
A
A B
A B C

Input Format: N = 6
Result:
A
A B
A B C
A B C D
A B C D E
A B C D E F

     */

    public static void main(String[] args) {
        int n = 6;
        pattern13(n);
    }

    private static void pattern13(int n) {
        char c = 'A';
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<=i; j++ )
            {
                System.out.print(c++);
            }
            c = 'A';
            System.out.println();
        }

    }

}
