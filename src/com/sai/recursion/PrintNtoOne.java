package com.sai.recursion;

public class PrintNtoOne {

    public static void main(String[] args) {
        int i=1;
        int n=10;
        printNToOne(i,n);
    }

    private static void printNToOne(int i, int n) {
        System.out.println(n);
        if(n>i)
            printNToOne(i,n-1);
    }

}
