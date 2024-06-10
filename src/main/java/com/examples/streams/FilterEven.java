package com.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FilterEven {
    public static void main(String args[]){
        List<Integer> integerList = Arrays.asList(10,15,8,49,25,98,32);
        Consumer c1 =  a-> System.out.println(a);
        integerList.stream().filter(i-> i%2==0).forEach((i)->System.out.println(i));


    }
}
