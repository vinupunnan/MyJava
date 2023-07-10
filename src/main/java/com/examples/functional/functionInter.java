package com.examples.functional;

@FunctionalInterface
public interface functionInter {
    public void sum(int a, int b);

    default void test() {
        System.out.println("Hello I am in default method");
    }

    public static void testTwo() {

        System.out.println("Hello I am in static  method");
    }

}
