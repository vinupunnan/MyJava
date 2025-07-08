package com.examples.functional;

public class AdderLamda {
    public static void main(String args[]){
        AdderInterFace adder = (a,b)-> a+b;
        int a = adder.add(10,20);
        System.out.println(a);
        AdderInterFace test = new Test();
        System.out.println(test.add(30,20));

        AdderInterFace test2 = (c,d)->c-d;
      int minus =   test2.add(50,56);
      System.out.println(minus);
    }

}
