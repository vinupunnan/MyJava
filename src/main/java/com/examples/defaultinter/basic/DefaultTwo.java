package com.examples.defaultinter.basic;

public interface DefaultTwo {
    public void saveAlerts(int a);
    default void testMethod()
    {
        System.out.println("I m in the  DefaultTwo default method ");
    }
    public static void staticMethod(){
        System.out.println("I am in the DefaultTwo static method  ");
    }
}
