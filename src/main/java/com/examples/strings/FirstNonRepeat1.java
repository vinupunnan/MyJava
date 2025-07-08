package com.examples.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat1 {
    public static void main(String args[]) {
        String str = "swiss";
        String[] strArray = str.split("");
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            lhm.put(strArray[i], lhm.getOrDefault(strArray[i], 0) + 1);

        }
        System.out.println(lhm);

        for (Map.Entry<String, Integer> me:lhm.entrySet()){
           if (me.getValue() ==1){
               System.out.println(me.getKey());
              break;
           }
        }
    }
}