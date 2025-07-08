package com.examples.defaultinter.basic;

public class InterOverride implements Defaultexample,DefaultTwo{

    @Override
    public void saveAlerts(int a) {

    }

    @Override
    public void testMethod() {
        DefaultTwo.super.testMethod();
    }

    public void  test1(){
        DefaultTwo.staticMethod();
    }

}
