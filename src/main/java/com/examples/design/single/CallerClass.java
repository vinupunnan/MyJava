package com.examples.design.single;

public class CallerClass {
    public static void main(String args[]){
     MySingleTon single1 = MySingleTon.getInstance();
        MySingleTon single2 = MySingleTon.getInstance();
        System.out.println(single1.hashCode());
        System.out.println(single2.hashCode());
    }
}
