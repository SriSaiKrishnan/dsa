package com.sai.mathpractice;

public class GCDofTwoNumbers {

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {

        int ans = 1;
        for(int i=1; i<=Math.min(a,b); i++)
        {
            if((a%i == 0) && (b%i == 0))
                ans = i;
        }
        return ans;
    }

}
