package com.examples.defaultinter.inherit;

public interface Right {
    default void m1(){
        System.out.println("I m in default Right m1");
    }
}
