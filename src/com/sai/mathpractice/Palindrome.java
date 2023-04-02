package com.sai.mathpractice;

import java.sql.Struct;

public class Palindrome {

    /*

Example 1:
Input: N = 123
Output: Not Palindrome Number
Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

Example 2:
Input: N =  121
Output: Palindrome Number
Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.

     */

    public static void main(String[] args) {

        int n = 121;
        System.out.println(palindrome(n));

    }

    private static String palindrome(int n) {
        String pal = "";
        int beforeReverse = n;
        int afterReverse = 0;
        while (n>0)
        {
            int rem = n % 10;
            afterReverse = (afterReverse * 10) + rem;
            n = n / 10;
        }
        if(beforeReverse == afterReverse)
            pal = "The Number is Palindrome";
        else
            pal = "The Number is not Palindrome";
        return pal;
    }

}
