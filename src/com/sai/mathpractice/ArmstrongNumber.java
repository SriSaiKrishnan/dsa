package com.sai.mathpractice;

public class ArmstrongNumber {

    /*

Example 1:
Input:153
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

Input:170
Output: No, it is not an Armstrong Number
Explanation: 1^3 + 7^3 + 0^3 != 170

     */

    public static void main(String[] args) {
        int n = 170;
        System.out.println(armstrongNumber(n));
    }

    private static String armstrongNumber(int n) {
        String armstrong = "";
        int before = n;
        int after = 0;
        while (n>0)
        {
            int rem = n % 10;
            after = after + (rem * rem * rem);
            n = n / 10;
        }
        if(before == after)
            armstrong = "The givem number is armstromng number";
        else
            armstrong = "The given number is not armstrong number";
        return armstrong;
    }

}
