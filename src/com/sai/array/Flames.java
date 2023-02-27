package com.sai.array;

public class Flames {

   private static int cntr = 0;
   private static String last;

    public static void main(String[] args) {
       String str = "Naveen";
       flames(str);
        System.out.println(last);
    }

    private static void flames(String str) {
        String replace ="";
        for( int i=0; i<str.length(); i++)
        {
            cntr++;
            if(cntr % 3 == 0) {
                continue;
            }
            replace = replace + str.charAt(i);
            last = replace;
        }
        if(replace.length()==1)
            return;
        flames(replace);
    }

}
