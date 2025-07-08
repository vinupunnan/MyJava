package com.examples.strings;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static void main(String args[]){
         String str = "rogramminglanguage";
        String[] strArray = str.split("");
        LinkedHashMap<String,Integer> hm = new LinkedHashMap();
        for(int i=0;i<str.length();i++){
            hm.put(strArray[i], hm.getOrDefault(strArray[i], 0) + 1);
            System.out.println(hm);
          //  hm.put(strArray[i],22);
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue() ==1){
                System.out.println(entry.getKey());
                return ;
            }
 }



}

    private static Integer countOccurances(String s, String[] strArray) {
        int count =0 ;
        for(int i =0 ;i<strArray.length ;i++){
            if(s.equals(strArray[i])){
                count = count+1;
            }
        }
        return count;
    }
    }
