package com.examples.streams;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonrepeatedCharacter {
    public static void main(String args[]) {
        String input = "Java articles are Awesome";
        String newInput = input.replaceAll("\\s+", "");
        System.out.println(newInput);
        String[] strarry = input.split("");
        System.out.println(strarry[0]);
        LinkedHashMap<String, Integer> hm = new LinkedHashMap();
        for (int i = 0; i < strarry.length; i++) {
          hm.put(strarry[i],hm.getOrDefault(strarry[i],0)+1);
        }
        System.out.println(hm);
         for(Map.Entry me : hm.entrySet()){
             me.getKey();
           int test= (int) me.getValue();
           if(test ==1){

System.out.println(me.getKey());
 return;
            }
        }
    }


}
