package com.examples.sorting;

import com.examples.compare.MyIdComparator;

import java.util.*;

public class MapValSort {
    public static void main(String args[]) {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put(1, "Apple");
        hm.put(2, "Mango");
        hm.put(3, "Cucumber");
        hm.put(4, "Grapes");
        hm.put(5, "Orange");
        hm.put(6, "Banana");

        LinkedHashMap Sorted = sortMap(hm);
        System.out.println(Sorted);

        }

    private static LinkedHashMap sortMap(LinkedHashMap lHm) {

     List<Map.Entry<Integer,String>> listTest = new LinkedList<>(lHm.entrySet());
     Collections.sort(listTest,new MyValComparator());
     LinkedHashMap<Integer,String> result = new LinkedHashMap();
     for(Map.Entry<Integer,String> t :listTest){
         result.put(t.getKey(),t.getValue());
            }
return  result;

}
}
