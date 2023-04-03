package com.sai.recursion;

public class PrintName {

    /*
        Print Name N times using Recursion
     */

    public static void main(String[] args) {
        int n=5;
        int i=1;
        printName(i,n);
    }

    private static void printName(int i, int n) {
        System.out.println("Sai Krishnan");
        if(i<n)
            printName(i+1, n);
    }

}
