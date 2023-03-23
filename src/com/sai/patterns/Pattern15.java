package com.sai.patterns;

public class Pattern15 {

    /*

Input Format: N = 3
Result:
A B C
A B
A

Input Format: N = 6
Result:
A B C D E F
A B C D E
A B C D
A B C
A B
A

     */

    public static void main(String[] args) {
        int n=6;
        pattern15(n);
    }

    private static void pattern15(int n) {
        char c = 'A';
        for (int i=n; i>0; i--)
        {

            for (int j=i; j>0; j--)
            {
                System.out.print(c +" ");
                c++;
            }
            c = 'A';
            System.out.println();
        }

    }

}
