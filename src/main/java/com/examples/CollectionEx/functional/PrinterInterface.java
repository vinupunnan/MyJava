package com.examples.CollectionEx.functional;
@FunctionalInterface
//will contain only one abstract method
//Can have default and static methods
public interface PrinterInterface {
    public void print();

    default void testMethod()
    {
        System.out.println("I m in the default method of the Interface");
    }

    public  static void testStaticMethod(){
        System.out.println("I m in the static  method of the Functional Interface");
    }

}
