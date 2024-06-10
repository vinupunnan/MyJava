package com.examples.CollectionEx.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CosumerExmple  {

    public static void main(String args[]){

     Consumer<Integer> consume =    i-> {
            System.out.println(i);
        };
        consume.accept(10);
        List<Integer> integerList = Arrays.asList(15,12,34,77,66,36,33);
       // System.out.println(integerList);
        integerList.stream().forEach(consume);
    }



}
