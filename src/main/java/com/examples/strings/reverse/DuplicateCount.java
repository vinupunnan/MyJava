package com.examples.strings.reverse;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateCount {
    public static void main(String args[]){

        String str ="Better Butter";

     String[] strArry =   str.split("");
     System.out.println(Arrays.toString(strArry));
     HashMap<String, Integer> hm  = new HashMap<String,Integer>();
     for(int i =0 ;i<strArry.length;i++){
         if (strArry[i].equals(" ")) continue;
        hm.put(strArry[i],hm.getOrDefault(strArry[i],0) + 1);
     }

     System.out.println(hm);
    }
}
