package com.examples.strings;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String args[]){
      String str ="ABCDAEFGHGGI";
      HashSet<Character> hs = new HashSet();
      for(int i =0 ;i<str.length() ;i++){
          char c = str.charAt(i);
          System.out.println(c);
          hs.add(c);
      }
      String strNew = "";
      for(Character c :hs){
          strNew = strNew +String.valueOf(c);

      }
      System.out.println("New String "+strNew);
    }
}
