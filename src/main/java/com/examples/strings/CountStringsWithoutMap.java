package com.examples.strings;

import java.util.HashSet;

public class CountStringsWithoutMap {
    public static void main(String args[]){
        String str = "applePie";
        String[] strArray = str.split("");
     HashSet<String> hs = new HashSet<>();
        for(String input :strArray){
            if(!hs.contains(input.toLowerCase())){
                int count = calOccurences(strArray, input);
                System.out.println(input + "cout=" + count);
                hs.add(input);
            }
        }
    }

    private static int calOccurences(String[] strArray, String input) {
        int count =0;
        for(String s :strArray){
            if(s.equalsIgnoreCase(input)){
                count = count +1 ;
            }

        }
        return count;
    }
}
