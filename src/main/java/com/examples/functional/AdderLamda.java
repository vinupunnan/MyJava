package com.examples.functional;

public class AdderLamda {
    public static void main(String args[]){
        AdderInterFace adder = (a,b)-> a+b;
        int a = adder.add(10,20);
        System.out.println(a);
    }

}
