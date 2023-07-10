package com.examples.defaultinter.inherit;

public interface Left {
    String test ="Hello";

    default void m1(){
        System.out.println("I m in default Left m1");
    }
    default void m2(){
        System.out.println("I m in default Left m2");
    }
}
