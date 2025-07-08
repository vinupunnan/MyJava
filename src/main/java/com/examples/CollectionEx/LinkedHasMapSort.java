package com.examples.CollectionEx;

import java.util.*;

public class LinkedHasMapSort {
    public static void main(String args[]) {
        LinkedHashMap lm = new LinkedHashMap();
        lm.put(1, "Grape");
        lm.put(2, "Orabge");
        lm.put(3, "Apple");
        lm.put(4, "Papaya");
        System.out.println(lm);


        List<Map.Entry<Integer, String>> lmList = new ArrayList(lm.entrySet());
        Collections.sort(lmList, new MapComparatorr());
        LinkedHashMap sortedMap = new LinkedHashMap();
      //  lm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(entry->sortedMap.put() );
        for (Map.Entry<Integer, String> test : lmList) {
             sortedMap.put(test.getKey(),test.getValue());
        }

        System.out.println(sortedMap);

    }
}