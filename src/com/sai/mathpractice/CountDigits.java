package com.sai.mathpractice;

public class CountDigits {

    /*

Example 1:
Input: N = 12345
Output: 5
Explanation: N has 5 digits

Example 2:
Input: N = 8394
Output: 4
Explanation: N has 4 digits

     */

    public static void main(String[] args) {

        int n = 123;
        System.out.println(countDigit(n));
    }

    private static int countDigit(int n) {
        int count = 0;
        while (n>0)
        {
            count++;
            n = n / 10;
        }
        return count;
    }

}
