package com.examples.ArrayListExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomArrayListMain {
    public static void main(String args[]){
        Set testSt= new HashSet();
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add("a");
        customArrayList.add("a");
        customArrayList.add("a");
        customArrayList.add("b");
        System.out.println(customArrayList.toString());

    }
}
