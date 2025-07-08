package com.examples.strings;

public class LongestSubstring {
    public static void  main(String args[]){
        String str = "abcabcbb";
        String[] strArry = str.split("");
        int count =0 ;
        String strNew = "";
        for(int i =0 ;i<strArry.length;i++){

           while(!strArry[i].equals(strArry[i+1])){
               strNew = strArry[i] +strArry[i+1]+strNew;
               count ++;
           }

                   }

    }
}
