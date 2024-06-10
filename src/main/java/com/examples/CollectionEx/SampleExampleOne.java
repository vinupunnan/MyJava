package com.examples.CollectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SampleExampleOne {
    public static void main(String args[]) throws Exception{
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(10);
        testList.add(20);
        testList.add(30);
        testList.add(40);
        testList.add(50);
      List<Integer> modifiedList =  testList.stream().map(t ->t*t).collect(Collectors.toList());
        System.out.println(testList);
      System.out.println(modifiedList);


    }
}
