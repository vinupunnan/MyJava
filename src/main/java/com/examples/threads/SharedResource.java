package com.examples.threads;

import java.util.HashMap;
import java.util.Map;

public class SharedResource {
    private Map<String ,Integer> products = new HashMap<String,Integer>();
    public SharedResource(){
        products.put("Book",10);
        products.put("Pencil",2);
        products.put("Cycle",5);
        products.put("Camera",3);
        products.put("Coat",5);
    }



}
