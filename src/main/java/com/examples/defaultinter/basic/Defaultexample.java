package com.examples.defaultinter.basic;

public interface Defaultexample {
    default void testMethod()
    {
        System.out.println("I m in the  parent default method ");
    }
    public static void staticMethod(){
        System.out.println("I am in the parent static method  ");
    }
}
