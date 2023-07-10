package com.examples.defaultinter.basic;

public interface Defaultexample {
    default void testMethod()
    {
        System.out.println("I m in the default method of the inter face");
    }
}
