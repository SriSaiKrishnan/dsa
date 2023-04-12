package com.sai.array;

public class Anagram {

        public static void main(String[] args) {
                System.out.println(anag());
        }

public static boolean anag() {

        String s = "abc", t = "abc";

        if(s.length() != t.length()) return false;
        int[] arr = new int[26];

        for(Character st : s.toCharArray()){
        arr[st - 'a']++;
        }

        for(Character st : t.toCharArray()){

        if(arr[st - 'a'] <=0) return false;
        else
        arr[st - 'a']--;
        }

        return true;
        }
}