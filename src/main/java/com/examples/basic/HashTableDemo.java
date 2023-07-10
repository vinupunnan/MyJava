package com.examples.basic;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String args[]){
        Hashtable hb = new Hashtable();
        hb.put(new HashDeMoFunction(5),"A");
        hb.put(new HashDeMoFunction(2),"B");
        hb.put(new HashDeMoFunction(6),"C");
        hb.put(new HashDeMoFunction(15),"D");
        hb.put(new HashDeMoFunction(23),"E");
        hb.put(new HashDeMoFunction(16),"F");
      ;


        System.out.println(hb);
    }
}
