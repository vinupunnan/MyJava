package com.examples.defaultinter.inherit;

public class Mydefault implements Right,Left {
    String test = "Kilo";
    String lol = Left.test;

    @Override
    public void m2() {

    }

    @Override
    public void m1() {

    }

//    @Override
//    public void m1() {
//
//    }

//      @Override
//    public void m1() {
//
//    }
    //Overrided implemnatation needed as default methods
    // with same method signatures exist in Right and left intefaces
//    public void m1(){
//        System.out.println(test);
//        System.out.println(lol);
//        System.out.println("My overrided implementation to avoid compilation error");
//        //U can call ur desired m1
//        Right.super.m1();
//        Left.super.m1();
//    }
}
