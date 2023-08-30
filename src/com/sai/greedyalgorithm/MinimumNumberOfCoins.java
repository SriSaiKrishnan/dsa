package com.sai.greedyalgorithm;

/*

Problem Statement: Given a value V, if we want to make a change for V Rs, and we have an infinite supply of each of the denominations in Indian currency, i.e., we have an infinite supply of { 1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, what is the minimum number of coins and/or notes needed to make the change.

Examples:

Example 1:

Input: V = 70

Output: 2

Explanation: We need a 50 Rs note and a 20 Rs note.

Example 2:

Input: V = 121

Output: 3

Explanation: We need a 100 Rs note, a 20 Rs note and a 1 Rs coin.

 */

public class MinimumNumberOfCoins {

   static int denomaination[];

    public static void main(String[] args) {
        int rs = 2004;
        denomaination = new int[]{1, 2, 5, 10, 20, 50, 100, 500, 1000};
        System.out.println(findMinimumNumberOfCoins(rs));
    }

    private static int findMinimumNumberOfCoins(int rs) {
        int coins = 0;
        for(int i=0; i<denomaination.length-1; i++)
        {
            if(rs < denomaination[i+1])
            {
                coins++;
                rs = rs - denomaination[i];
                if(rs > 0)
                    i=0;
                else
                    break;
            }else if(rs >= 1000)
            {
                coins++;
                rs = rs - 1000;
                if(rs > 0)
                    i=0;
                else
                    break;
            }
        }
        return coins;
    }

}
