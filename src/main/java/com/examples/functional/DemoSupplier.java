package com.examples.functional;

import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String args[]){
        Supplier<String> supplier = ()-> "test";
       String str =  supplier.get();
       System.out.println(str);
    }
}
