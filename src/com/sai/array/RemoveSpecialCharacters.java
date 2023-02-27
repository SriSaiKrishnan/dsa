package com.sai.array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {
        String str = "Hello";
        //removeSpecialCharacters(str);
        containsSpecialCharacters(str);
    }

    private static void containsSpecialCharacters(String str) {

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9 &&[^-_]]");
        Matcher matcher = pattern.matcher(str);
        boolean isStringContainsSpecialCharacter = matcher.find();
        if(isStringContainsSpecialCharacter)
            System.out.println(str+ " contains special character");
        else
            System.out.println(str+ " does NOT contain special character");

    }

    private static void removeSpecialCharacters(String str) {

        String resultStr="";
            //loop execute till the length of the string
        for (int i=0;i<str.length();i++)
        {
                //comparing alphabets with their corresponding ASCII value
            if ((str.charAt(i)>64 && str.charAt(i)<=122)
                    || (str.charAt(i) == 32)
                        || (str.charAt(i) == 45)
                            || (str.charAt(i) == 95)) //returns true if both conditions returns true
            {
                    //adding characters into empty string
                resultStr=resultStr+str.charAt(i);
            }
        }
        System.out.println("String after removing special characters: "+resultStr);

    }

}
