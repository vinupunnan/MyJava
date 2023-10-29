package com.examples.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountStrings {
    public static void main(String args[]) {
        String inputString = "ilovejavatechie";
        //{a=2, c=1, t=1, e=3, v=2, h=1, i=2, j=1, l=1, o=1}

        String[] c =   inputString.split("");
        System.out.println(Arrays.toString(c));
        Map<String,Integer > hm = new HashMap<String,Integer>() ;
        for(int i =0;i<c.length;i++){
            String key =c[i];
            Integer val = calculateVal(key,c);
            hm.put(key,val);
        }
        System.out.println(hm);
    }

    private static Integer calculateVal(String key,String[] c) {
        int count =0;
        for(int i =0;i<c.length;i++){
            if(key.equals(c[i])){
                count++;
            }

        }
        return count;
    }
}
