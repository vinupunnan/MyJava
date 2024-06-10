package com.examples.threads;

import java.util.HashMap;
import java.util.Map;

public class SharedResource {
    private Map<String ,Integer> products = new HashMap<String,Integer>();
    public SharedResource(){
        products.put("Book",Integer.valueOf(10));
        products.put("Pencil",Integer.valueOf(1));
        products.put("Cycle",Integer.valueOf(5));
        products.put("Camera",Integer.valueOf(6));
        products.put("Coat",Integer.valueOf(5));
    }
public void  buyProduct(String key)
        {

}


}
