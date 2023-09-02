package com.sai.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    private static int fibonacci(int i) {

        if(i <= 1)
           return i;

        return fibonacci(i-1) + fibonacci(i-2);
    }

}
