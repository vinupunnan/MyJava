package com.examples.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBAsic {
    public static void main(String args[]){
        HashMap map = new HashMap();
        map.put("apple", 2);
        map.put("banana", 3);
        map.put("orange", 5);

        Set<Map.Entry<String,Integer>> set  =  map.entrySet();
       for(Map.Entry me :set){
         System.out.println(me.getKey());
           System.out.println(me.getValue());


       }
    }
}
