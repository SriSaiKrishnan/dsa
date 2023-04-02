package com.sai.mathpractice;

public class PrimeNumber {

    /*

Example 1:
Input: N = 3
Output: Prime
Explanation: 3 is a prime number

Example 2:
Input: N = 26
Output: Non-Prime
Explanation: 26 is not prime

     */

    public static void main(String[] args) {

        int n = 49;
        checkPrime(n);

    }

    private static void checkPrime(int n) {

        int m=0;
        int flag=0;
        m=n/2;
        if(n==0 || n==1)
            System.out.println("The Number is not Prime");
        for (int i=2; i<=m; i++)
        {
            if(n%i == 0)
            {
                System.out.println("The Number is not Prime");
                flag = 1;
                break;
            }
        }

        if(flag == 0)
            System.out.println("The Number is Prime");
    }

}
