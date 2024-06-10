package com.examples.CollectionEx;

import java.util.HashSet;
import java.util.Set;

public class ExampleOne {
    public static void main (String args[]) {

//        Set mySet = new HashSet<String>();
//        mySet.add("a");;
//        mySet.add("b");
//        mySet.add("b");
//        mySet.add("b");
//        System.out.println(mySet);//Internally map is used for storing the values
        String s = "12345";
        // System.out.println(s.length());
        // System.out.println(s.indexOf('a'));

        Integer s1 = Integer.parseInt(s.substring(0, s.length() / 2));
        Integer s2 = Integer.parseInt(s.substring(s.length() / 2 + 1, s.length()));
        int count = 0;
        int result1 = 0;
        int result2 = 0;
        int sum =0;
        int sum2 = 0;
        for (int i = 0; i < 2; i++) {
            result1 = s1 % 10;
            System.out.println("result" + result1);
            s1 = s1 / 10;
            sum = result1+sum;

        }
        System.out.println(sum);
        for (int i = 0; i < 2; i++) {
            result2 = s2 % 10;
            System.out.println("result" + result2);
            sum2 = s2 / 10;
            sum2 = result2+sum2;

        }
//        System.out.println(sum2);
//        if(sum==sum2 && s.indexOf((s.charAt(s.length() / 2)/2==0))){
//            System.out(s.indexOf())
//        }
    }

    }


