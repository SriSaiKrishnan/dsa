package com.sai.mathpractice;

public class PrintAllDivisor {

    /*

Example 1:
Input: n = 36
Output: 1 2 3 4 6 9 12 18 36
Explanation: All the divisors of 36 are printed.

Example 2:
Input: n = 97
Output: 1 97
Explanation: Since 97 is a prime number, only 1 and 97 are printed.

     */

    public static void main(String[] args) {
        int n = 48;
        printAllDivisor(n);
    }

    private static void printAllDivisor(int n) {
        if(!isPrime(n))
        {
           for (int i=1; i<=n; i++)
           {
               if( n%i == 0)
                   System.out.print(i + " ");
           }
        }
        else
            System.out.println("Since " + n + " is a prime number, only 1 and "+  n + " are printed.");


    }

    private static boolean isPrime(int n) {
        int m=0;
        boolean flag=true;
        m=n/2;
        if(n==0 || n==1)
            flag = false;
        for (int i=2; i<=m; i++)
        {
            if(n%i == 0)
            {
                flag = false;
                break;
            }
        }

      return flag;
    }

}
