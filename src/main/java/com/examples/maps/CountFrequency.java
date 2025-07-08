package com.examples.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountFrequency {
    public static void main(String args[]){
        String[] stringArray1 = new String[] {"apple", "banana", "apple", "orange", "banana"};
        List<String> fruitList= Arrays.asList(stringArray1);
        HashMap<String, Integer> hm = new HashMap();
        for(String  s:fruitList){
       hm.put(s, hm.getOrDefault(s,0) + 1);
        }
        System.out.println(hm);
    }


}
