package com.examples.iterartor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapFailFast {
    public static void main(String args[]){
        Map<Integer,String> hm = new HashMap();
        hm.put(1,"Vinod");
        hm.put(2,"Sinod");
        hm.put(3,"Dinu");
        hm.put(4,"Chinu");


        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry  entry : hm.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
            hm.put(5, "Rayappan");
    }
    }
}
