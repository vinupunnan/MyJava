package com.examples.defaultinter.basic;

public interface Defaultexample {
    public void saveAlerts(int a);
    default void testMethod()
    {
        System.out.println("I am in DefaultExample");
    }
    public static void staticMethod(){
        System.out.println("I am in the Defaultexample static method  ");
    }
}
