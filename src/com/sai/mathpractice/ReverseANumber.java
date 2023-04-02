package com.sai.mathpractice;

public class ReverseANumber {

    /*

Example 1:
Input: N = 123
Output: 321
Explanation: The reverse of 123 is 321

Example 2:
Input: N = 234
Output: 432
Explanation: The reverse of 234 is 432

     */

    public static void main(String[] args) {

        int n = 234;
        System.out.println(reverseNumber(n));

    }

    private static int reverseNumber(int n) {
        int reversedNumber = 0;
        while (n>0)
        {
            int rem = n % 10;
            reversedNumber = (reversedNumber * 10) + rem;
            n = n / 10;
        }
        return reversedNumber;
    }

}
