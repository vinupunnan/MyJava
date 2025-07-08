package com.examples.strings;

public class LongestPalidrome {
    public static void main (String args[])

    {
        String inputString = "civicmyfrirotator";
        String currentPlindrome;
        String highestPalindrome ="";

        for(int i =0;i<inputString.length();i++){
            for(int j =i+1; j <= inputString.length();j++){
              String sub = inputString.substring(i,j);
             // System.out.println(sub);
            //  boolean isPalindrome=  chekPalindorm(s);
              if(chekPalindorm(sub)){
               //  System.out.println(sub);
                  currentPlindrome = sub;
                  if(currentPlindrome.length() >highestPalindrome.length()){
                      highestPalindrome=currentPlindrome;


                  }
              }
            }

        }
        System.out.println(highestPalindrome);
    }

    private static boolean chekPalindorm(String s) {
        int left =0;
        int right = s.length()-1;
        while(left < right){
          if (s.charAt(left) != s.charAt(right)){
              return false;
          }
          left ++;
          right --;
        }

        return true;
    }
}
