package com.sai.recursion;

/*

Problem Statement: “Given a string, check if the string is palindrome or not.”  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.

 */

public class Palindrome {

    public static String  reversedStr = "";

    public static void main(String[] args) {
        String str = "TAKE U FORWARD";
        int len = str.length();
       if(str.equalsIgnoreCase(palindrome(str,len)))
           System.out.println("The String is Palindrome");
       else
           System.out.println("The String is not Palindrome");
    }

    private static String palindrome(String str, int len) {


        if(len<=0)
            return reversedStr;

        reversedStr = reversedStr + str.substring(len-1, len);
        return  palindrome(str,--len);

    }

}
