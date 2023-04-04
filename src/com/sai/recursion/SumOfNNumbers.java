package com.sai.recursion;


    /*
Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Example 2:
Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=21
     */


public class SumOfNNumbers {

public static int sum=0;

    public static void main(String[] args) {
        int i=1;
        int n=6;
        sumOfNNumber(i,n);
        System.out.println(sum);
    }

    private static void sumOfNNumber(int i, int n) {
        sum = sum + i;
        if(i<n)
            sumOfNNumber(i+1,n);
    }

}
