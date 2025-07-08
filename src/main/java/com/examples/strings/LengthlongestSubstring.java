package com.examples.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LengthlongestSubstring {
    public static void main(String args[]){
        String s = "abcabcbb";
        s.length();
        int rigt =0;
        int left =0;
        int maxlength =0;
        Set sh = new LinkedHashSet();
        for(int i =0;i<s.length();i++){
           char c =  s.charAt(i);
           if(sh.contains(c)){
               char r = s.charAt(left);
               sh.remove(r);
               left++;
           }
            sh.add(c);
           if(sh.size() > maxlength){
               maxlength=sh.size();
           }



        }
     System.out.println(sh);
      System.out.println(maxlength);
    }
}
