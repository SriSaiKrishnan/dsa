package com.sai.patterns;

public class Pattern22 {

    /*

Input Format: N = 3
Result:
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3

Input Format: N = 6
Result:
6 6 6 6 6 6 6 6 6 6 6
6 5 5 5 5 5 5 5 5 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 2 1 2 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6

     */

    public static void main(String[] args) {
        int n = 6;
        pattern22(n);
    }

    private static void pattern22(int n) {

        for(int i=0; i<2*n-1; i++)
        {
            for(int j=0; j<2*n-1; j++)
            {
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int down = (2*n - 2) -i;
                System.out.print(n - Math.min(Math.min(top,down),Math.min(left,right)));
            }
            System.out.println();
        }

    }

}
