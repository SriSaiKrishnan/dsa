package com.sai.array;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] arr = {"dog", "cat", "god", "tac", "ogd", "man"};
        groupAnagram(arr);
    }

    private static void groupAnagram(String[] arr) {
        Map<String, ArrayList> group = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String[][] grp = new String[arr.length][arr.length];
        for (int i=0; i<arr.length-1; i++){
           for (int j=i+1; j<arr.length; j++){
               if(checkAnagram(arr[i],arr[j]))
               {
                   if(list.contains(arr[i]))
                   {
                       list.add(arr[j]);
                   }else{
                       list.add(arr[i]);
                       list.add(arr[j]);
                   }
               }
           }
           group.put(arr[i],list);
           list.clear();
        }
        System.out.println(group);
    }

    private static boolean checkAnagram(String s1, String s2) {
       char[] ch1 = s1.toCharArray();
       char[] ch2 = s2.toCharArray();
       boolean flag = false;
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       if(ch1.length == ch2.length)
       {
           for(int i=0; i<ch1.length; i++){
               if(ch1[i] == ch2[i])
               {
                   flag = true;
                   continue;
               }else {
                   flag = false;
                   break;
               }
           }
       }
       return flag;
    }
}
