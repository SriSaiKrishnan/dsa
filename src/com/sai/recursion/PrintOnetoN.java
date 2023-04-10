package com.sai.recursion;

public class PrintOnetoN {

    /*
        Print from 1 to N using Recursion
     */

    public static void main(String[] args) {
        int i=1;
        int n=10;
        printOneToN(i,10);
    }

    private static void printOneToN(int i, int n) {

        System.out.println(i);
        if(i<n)
            printOneToN(i+1,n);

    }

}
