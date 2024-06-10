package com.examples.defaultinter.basic;

public class RunnerDefault {
    public static void main (String args[]){
        Defaultexample.staticMethod();
        Defaultexample example = new Inter();
        example.testMethod();
//        Inter inter = new Inter();
//        inter.testMethod();

//        InterOverride interOver = new InterOverride();
//        interOver.testMethod();
    }
}
